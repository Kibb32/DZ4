import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        //на вход вводится кол-во ворон (целое)
        //ваша программа должна выдать правильное склонение
        // 1 - ворона, 1000001 - ворона
        // 4 - вороны, 584 - вороны
        //пользоватся при решении switch
        //1-ворона
        //2,3,4 - вороны
        //0,5,6,7,8,9 - ворон

        Scanner input = new Scanner(System.in);

        int countOfRaven;

        try {

        System.out.print("сколько на поле приелетело ворон? : ");
        countOfRaven = input.nextInt();
        int lastDigit = countOfRaven % 10;
        int penultDigit = countOfRaven % 100 / 10;

        if(penultDigit == 1){
            System.out.println("Ворон");
        }else {

        switch (lastDigit) {
            case 1:
                System.out.println("Ворона");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("Вороны");
                break;
            default:
                System.out.print("Ворон");
                break;
        }}
    } catch (Exception e){
        System.out.println("Что-то пошло не так,перезапустите программу");
    }
}}

