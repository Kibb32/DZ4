package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int crane;
        int childPetya;
        int childKatya;
        int childSergey;
        int amountOfChildren;

        try {
            System.out.print("Введите число журавликов: ");
            crane = input.nextInt();

            amountOfChildren = 3;
            childPetya = (crane / amountOfChildren) / 2; // парни сделали одинаковое кол-во журавлей
            childSergey = childPetya;
            childKatya = (childSergey + childPetya) * 2; // Катя сделала в 2 раза больше


            if (crane > 100000) {
                System.out.println("Дети не могли сделать столько журавликов");
                return;
            }
            if (crane % amountOfChildren != 0) {
                System.out.print("Дети не могли столько сделать");
                return;
            } else {
                System.out.print("Петя собрал: " + childPetya + " Катя собрала: " + childKatya + " Сережа собрал: " + childSergey);
            }
        } catch (Exception e){
        System.out.println("Что-то пошло не так,перезапустите программу");



    }
}}
