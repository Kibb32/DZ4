package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);

        int first;
        int second;
        int check ;

        try {
            System.out.print("Введите первое число: ");
            first = input.nextInt();
            if (first > 100) {
                System.out.println("Введите число от 0 до 100");
                return;
            }

            System.out.print("Введите второе число: ");
            second = input.nextInt();
            if (second > 100) {
                System.out.println("Введите число от 0 до 100");
                return;
            }

            System.out.print("Введите третье  число: ");
            check = input.nextInt();

            if (check > 1000000) {
                System.out.println("Введите число от 0 до 1000000");
                return;
            } else if (check == first * second) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e){
            System.out.println("Что-то пошло не так,перезапустите программу");
        }
    }
}
