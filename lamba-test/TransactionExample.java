import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TransactionExample {
    public static void main(String[] args) {

        List<Transaction> tranList=Arrays.asList(
            new Transaction(124, "food"),
            new Transaction(12, "cloth"),
            new Transaction(1672, "Medicinie"),
            new Transaction(1267, "food"),
            new Transaction(142, "cosmetics"),
            new Transaction(12, "food"),
            new Transaction(123, "food"),
            new Transaction(1234, "Medicinie"),
            new Transaction(14532, "decor"),
            new Transaction(142, "cloth"),
        
            new Transaction(124, "groceries")
                                                                
        );

       Map<String,List<Double>> map3= tranList.stream().collect(Collectors.groupingBy(Transaction::getCategory,Collectors.mapping(Transaction::getPrice, 
               Collectors.toList())));

       System.out.println(map3);


      Map map4= tranList.stream()
               .collect(Collectors.groupingBy(
                       Transaction::getCategory,
                       Collectors.mapping(
                               Transaction::getPrice,
                               Collectors.summingDouble(Double::doubleValue))));

                               System.out.println(map4);
        
    }
    
}

 class Transaction  {

    double price;
    String category;
    
    public Transaction(double price, String category) {
        this.price = price;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    

    
}
