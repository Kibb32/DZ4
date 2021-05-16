package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);

        int guests;
        int cuts;
        int result;

        try {


        System.out.print("Введите число гостей: ");
        guests = input.nextInt();
        cuts = guests % 2;

        if (guests>1000){
            System.out.println("Число гостей не может быть больше 1000");
            return;
        }
        if (cuts == 0){
            result = guests/2;
            System.out.print ("Необходимо сделать разрезов: "+result);
        } else {
            System.out.print ("необходимо сделать разрезов: "+guests);
        }
        } catch (Exception e){
            System.out.println("Что-то пошло не так,перезапустите программу");

    }
}}
