package org.example;

public class Main {
    private static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.print("FizzBuzz\n");
            }
            else if((i % 3) == 0) {
                System.out.print("Fizz\n");
            }
            else if((i % 5) == 0) {
                System.out.print("Buzz\n");
            }
        }
}
    public static void main(String[] args) {
        fizzBuzz();
    }

}