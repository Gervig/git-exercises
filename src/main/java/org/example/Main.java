package org.example;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 200; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzFizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);

            }
        }
    }
}
