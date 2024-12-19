import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MappingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 20));

        Map<Integer, List<String>> namesByAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println(namesByAge); // Output: {20=[Bob, David], 30=[Alice, Charlie]}
        Map<Integer, List<Person>> personByAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.toList()));

                        System.out.println(personByAge);
    }
}
