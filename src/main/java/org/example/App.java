package org.example;

import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int inputInteger;
        do {
            System.out.println("Введите целое число больше 0");
            inputInteger = Integer.valueOf(scanner.nextLine());

        }while(inputInteger<1);
        printDigits(inputInteger);
    }

    public static void printDigits(int inputInt){
        IntStream.rangeClosed(1, inputInt).forEach(i->System.out.println((i % 3 != 0 && i % 5 != 0)? i : ((i % 3 == 0 && i % 5 == 0) ? "FooBar" : ((i % 3 == 0) ? "Foo" : "Bar"))));
    }

    public static void printDigits1(int inputInt){
        for(int i=1;i<=inputInt;i++){
            if(i % 3 != 0 && i % 5 != 0)System.out.println(i);
            else {
                if(i % 3 == 0) System.out.print("Foo");
                if(i % 5 == 0) System.out.print("Bar");
                System.out.println();
            }
        }
    }


    public static void printDigits2(int inputInt){
        if (inputInt>1){
            printDigits(inputInt-1);
        }
        if(inputInt % 3 != 0 && inputInt % 5 != 0)System.out.println(inputInt);
        else if(inputInt % 3 == 0 && inputInt % 5 == 0) System.out.println("FooBar");
        else if(inputInt % 3 == 0) System.out.println("Foo");
        else System.out.println("Bar");
    }

    public static void printDigits3(int inputInt){
        for(int i=1;i<=inputInt;i++){
            if(i % 3 != 0 && i % 5 != 0)System.out.println(i);
            else if(i % 3 == 0 && i % 5 == 0) System.out.println("FooBar");
            else if(i % 3 == 0) System.out.println("Foo");
            else System.out.println("Bar");
        }
    }

    public static void printDigits4(int inputInt){
        for(int i=1;i<=inputInt;i++){
            System.out.println((i % 3 != 0 && i % 5 != 0)? i : ((i % 3 == 0 && i % 5 == 0) ? "FooBar" : ((i % 3 == 0) ? "Foo" : "Bar")));
        }
    }









}
