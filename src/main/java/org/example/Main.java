package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FizzBuzz();

    }

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
}