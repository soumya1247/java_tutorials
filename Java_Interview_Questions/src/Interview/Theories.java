package Interview;

public class Theories {

}

//Predicate Example

//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class Main {
// public static void main(String[] args) {
//     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//     // Example 1: Filtering even numbers
//     Predicate<Integer> evenPredicate = number -> number % 2 == 0;
//     numbers.stream()
//            .filter(evenPredicate)
//            .forEach(System.out::println);
//
//     // Example 2: Checking if a number is greater than 5
//     Predicate<Integer> greaterThanFivePredicate = number -> number > 5;
//     System.out.println(greaterThanFivePredicate.test(7)); // Output: true
//     System.out.println(greaterThanFivePredicate.test(3)); // Output: false
// }
//}

//Consumer example

//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Main {
// public static void main(String[] args) {
//     List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//
//     // Example 1: Printing each element of the list
//     Consumer<String> printConsumer = name -> System.out.println("Hello, " + name);
//     names.forEach(printConsumer);
//
//     // Example 2: Converting each element to uppercase
//     Consumer<String> uppercaseConsumer = name -> System.out.println(name.toUpperCase());
//     names.forEach(uppercaseConsumer);
// }
//}

//Functional Interface Example

//@FunctionalInterface
//interface MathOperation {
// int operate(int a, int b);
//}
//
//MathOperation addition = (a, b) -> a + b;
//MathOperation subtraction = (a, b) -> a - b;

//Thread Implementation

//1. By Extending Thread Class
//class MyThread extends Thread {
// public void run() {
//     // Thread's code
// }
//}
//MyThread myThread = new MyThread();
//myThread.start(); // Starts the thread

//2. With Lambda Function
//public class Main {
// public static void main(String[] args) {
//     // Implementing Thread using lambda expression
//     Thread thread = new Thread(() -> {
//         // Thread logic goes here
//         System.out.println("Thread is running...");
//     });
//
//     // Starting the thread
//     thread.start();
// }
//}


//Runnable Implementation

//1. By Implementing Runnable
//class MyRunnable implements Runnable {
// public void run() {
//     // Thread's code
// }
//}
//Runnable runnable = new MyRunnable();
//Thread thread = new Thread(runnable);
//thread.start(); // Starts the thread

//2. With Lambda Function
//public class Main {
// public static void main(String[] args) {
//     // Implementing Runnable using lambda expression
//     Runnable task = () -> {
//         // Task logic goes here
//         System.out.println("Executing task...");
//     };
//
//     // Creating a thread with the task
//     Thread thread = new Thread(task);
//
//     // Starting the thread
//     thread.start();
// }
//}