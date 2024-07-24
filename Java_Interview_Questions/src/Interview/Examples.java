package Interview;

public class Examples {

}

//1. Sort Elements based on age
//2. Sort the same in descending order
//3. Output the first 2 elements
//4. Skip 1st element and out put rest

//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//       List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 25));
//        people.add(new Person("Bob", 30));
//        people.add(new Person("Charlie", 20));
//
//        // Sorting based on age using Stream API
//        List<Person> sortedPeople = people.stream()
//                .sorted(Comparator.comparingInt(Person::getAge).reversed())
//				  .sorted(Comparator.comparing(Person::getName).reversed())//If sort needed with name
//                .limit(2)
//                .skip(1)
//                .collect(Collectors.toList());
//
//        // Print the sorted list
//        sortedPeople.forEach(person ->
//                System.out.println(person.getName() + ": " + person.getAge()));
//        
//  }
//}
//
//public class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

//1. Sum of even numbers 

//public class Main {
//    public static void main(String[] args) {
//       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//long sum = numbers.stream()
//                  .filter(n -> n % 2 == 0) 
//                  .mapToInt(Integer::intValue) 
//                  .sum();
//
//System.out.println("Sum of even numbers: " + sum);
//  }
//}

//1. Sort names in a given array list 
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        // Sorting names in descending order using Stream API
//        List<String> sortedNames = names.stream()
//				  .sorted()// For ascending order
//                .sorted(Comparator.reverseOrder()) // Comparator for descending order
//                .collect(Collectors.toList());
//
//        // Print the sorted list
//        sortedNames.forEach(System.out::println);
//  }
//}

//1. Flatmap Example
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
//List<Integer> flatNumbers = numbers.stream()
//                                  .flatMap(List::stream)
//                                  .collect(Collectors.toList());
//  flatNumbers.stream().forEach(System.out::println);
//                               
//// Result: [1, 2, 3, 4]
//
//  }
//}

//1. Average of List

//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//double average = numbers.stream()
//                       .mapToInt(Integer::intValue)
//                       .average()
//                       .orElse(0.0);
//    System.out.println(average);
//                               
//// Result: [1, 2, 3, 4]
//
//  }
//}

//1. Given a list of integers, partition them into even and odd numbers.

//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
//                                                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//    System.out.println(partitionedNumbers);
//                               
//// {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
//
//  }
//}

//1. Given a list of strings, filter out the strings that contain the letter 'a' and then convert the remaining strings to uppercase.

//List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
//List<String> result = words.stream()
//                          .filter(s -> !s.contains("a"))
//                          .map(String::toUpperCase)
//                          .collect(Collectors.toList());

//1. Counting Elements:
//	
//	List<String> words = Arrays.asList("hello", "world", "java", "stream");
//	long count = words.stream().count();

//1. Maximum and Minimum of Elements

//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
// 
//        Optional<Integer> max;
//        max = list
//                .stream()
//                .max((a, b) -> a - b );
//        System.out.println("Maximum value of the list is " + max.get()); //9
//        
//        Optional<Integer> min;
//        min = list
//                .stream()
//                .max((a, b) -> b - a );
//        System.out.println("Minimum value of the list is " + min.get()); //-10
//                              
//
//  }
//}


//1. Group Elements by age

//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//      List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 25));
//        people.add(new Person("Bob", 30));
//        people.add(new Person("Charlie", 30));
//
//Map<Integer, List<Person>> personsByAge = people.stream()
//                                                 .collect(Collectors.groupingBy(Person::getAge));
//      personsByAge.forEach((age, personArray) -> System.out.println(age + ":" + personArray));
//  }
//}
//
//public class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

//1. Reducing Elements

//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//int sum = numbers.stream()
//                 .reduce(0, Integer::sum);

// Reverse a String in JAVA

//1. By Simple Method
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String input = "String to Reverse";
//
//        String reversedString = new StringBuilder(input).reverse().toString();
//
//        System.out.println("Reversed string: " + reversedString);
//  }
//}

//2. Without using .reverse and using Lambda
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String input = "String to Reverse";
//
//        String reversedString = new StringBuilder(
//                IntStream.range(0, input.length())
//                    .mapToObj(i -> input.charAt(input.length() - i - 1))
//                    .map(String::valueOf)
//                    .collect(Collectors.joining())
//        ).toString();
//
//        System.out.println("Reversed string: " + reversedString);
//  }
//}

// Fibonacci Numbers

//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//        int n = 10; // Number of Fibonacci numbers to generate
//        System.out.println("Fibonacci series up to " + n + " terms:");
//        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
//              .limit(n)
//              .forEach(fib -> System.out.print(fib[0] + " "));
//    }
//}




