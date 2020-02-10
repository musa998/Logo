package com.java.project.draw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = 3;
        // validate the input 2 < n < 10000
        try{
            do {
                n = scanner.nextInt();
            }while (n < 2 || n > 10000);

        }catch (Exception E){
            System.out.printf("Too big number");
            return;
        }


        MMlogo mMlogo = new MMlogo();
        System.out.println(MyPrinter.print(n, mMlogo));


    }

}
