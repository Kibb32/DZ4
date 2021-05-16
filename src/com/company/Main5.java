package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int childMasha;
        int childMichail;
        int berriesEaten;
        int berriesLeft;

        System.out.print("Сколько ягод собрала Маша: ");
        childMasha = input.nextInt();
        System.out.print("Сколько ягод собрал Михаил: ");
        childMichail = input.nextInt();
        System.out.print("Сколько ребята съели ягод: ");
        berriesEaten = input.nextInt();

        berriesLeft = (childMasha+childMichail) - berriesEaten;

        if (berriesLeft < 0){
            System.out.print("Импосибру");
        } else {System.out.print("Всего осталось ягод: "+berriesLeft);
    }
}}
