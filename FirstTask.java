package com.LaboratorJava.se.task1;

public class FirstTask {

    public void function (){
        System.out.println("Hello World");
        String [] Array = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);

        n = n * 3;
        n = n + 0b10101 + 0xFF;
        n = n * 6;
        int  sum = 0;

        while (n > 9){
            sum = 0;
            while (n > 0){
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println("Willy-nilly , this semester I will learn " + Array[n]);
    }

}
