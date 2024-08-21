package org.example;

public class Main {
    public static void fizzBuzz(){
        for(int i = 1; i < 100; i++){
            String res = "";
            if(i%3==0){
                res += "Fizz";
            }
            if(i%5==0){
                res += "Buzz";
            }
            if(i%3!=0 && i%5!=0){
                res += "" + i;
            }
            System.out.println(res);
        }
}
    public static void main(String[] args) {
        fizzBuzz();
    }

}