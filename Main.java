package org.example;

import java.util.Scanner;

public class Main {

    public static void task1(){
        //вывод названия поры года по номеру месяца switch case
        int month;
        while(true) {

            System.out.println("Введите номер месяца: ");
            month = getInput().nextInt();
            switch(month){
                case 1:
                    System.out.println("January");
                    return;
                case 2:
                    System.out.println("Fabruary");
                    return;
                case 3:
                    System.out.println("March");
                    return;
                case 4:
                    System.out.println("April");
                    return;
                case 5:
                    System.out.println("May");
                    return;
                case 6:
                    System.out.println("June");
                    return;
                case 7:
                    System.out.println("July");
                    return;
                case 8:
                    System.out.println("August");
                    return;
                case 9:
                    System.out.println("September");
                    return;
                case 10:
                    System.out.println("October");
                    return;
                case 11:
                    System.out.println("Novermber");
                    return;
                case 12:
                    System.out.println("December");
                    return;
                default:
                    System.out.println("Wrong number, enter number from 1 to 12");
            }
        }

    }
    public static void task2(){
        //task1 but if-else-if
        //извращение
        int month;
        System.out.println("Enter the number of month (from 1 to 12): ");
        month = getInput().nextInt();
        if (month == 1)
            System.out.println("January");
        else {
            if (month == 2)
                System.out.println("February");
            else {
                if (month == 3)
                    System.out.println("March");
                else {
                    if (month == 4)
                        System.out.println("April");
                    else {
                        if (month == 5)
                            System.out.println("May");
                        else {
                            if (month == 6)
                                System.out.println("June");
                            else {
                                if (month == 7)
                                    System.out.println("July");
                                else {
                                    if (month == 8)
                                        System.out.println("August");
                                    else {
                                        if (month == 9)
                                            System.out.println("September");
                                        else {
                                            if (month == 10)
                                                System.out.println("October");
                                            else {
                                                if (month == 11)
                                                    System.out.println("November");
                                                else {
                                                    if (month == 12)
                                                        System.out.println("December");
                                                    else
                                                        System.out.println("Error, please enter number from 1 to 12");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void task3(){
        //is number even or not
        int number;
        System.out.println("Please enter number: ");
        number = getInput().nextInt();
        if (number%2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is not even."); //я не знаю как нечет на англ
    }
    public static void task4(){
        //enter temperature, if t>-5 -> "warm", -5>=t>-20 -> normal, -20>=t -> cold
        int t;
        System.out.println("Enter temperature: ");
        t = getInput().nextInt();
        if (t > (-5))
            System.out.println("It's warm.");
        else {
            if (t <= (-20))
                System.out.println("It's cold.");
            else
                System.out.println("It's normal.");
        }
    }
    public static void task5(){
        //colour of rainbow from 1 to 7
        int color;
        System.out.println("Enter number of colour of rainbow: ");
        color = getInput().nextInt();
        switch(color){
            case 1:
                System.out.println("Red");
            case 2:
                System.out.println("Orange");
            case 3:
                System.out.println("Yellow");
            case 4:
                System.out.println("Green");
            case 5:
                System.out.println("Light blue");
            case 6:
                System.out.println("Blue");
            case 7:
                System.out.println("Purple");
            default:
                System.out.println("You entered wrong value.");
        }
    }

    public static void task6() {
        //for++, sout not even from 1 to 99
        for (int num = 1; num < 100; num++){
            if (num%2!=0)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void task7() {
        //for--, sout from 5 to 1
        for (int num = 5; num > 0; num--)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void task8() {
        //you enter Number, prog summs numbers from 1 to Number
        System.out.print("Enter number: ");
        int num = getInput().nextInt();
        int solution = 0;
        for (int Number = 0; Number <= num; Number++)
            solution = solution + Number;
        System.out.println(solution);
    }

    public static void task9() {
        //sout 7 14 21 ... 98
        for (int num = 7; num <=100; num++){
            if (num%7!=0)
                num = num+5;
            else
                System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void task10() {
        //sout 10 first numbers of 0 -5 -10 ...
        int counter = 10;
        for (int num = 0; counter > 0; num--){
            if (num%5!=0)
                num = num-3;
            else{
                System.out.print(num + " ");
                counter = counter -1;
            }
        }
        System.out.println();
    }

    public static void task11() {
        //squares of numbers  [10; 20]
        for (int num = 10; num <= 20; num++)
            System.out.print(num*num + " ");
        System.out.println();
    }

    public static void task12() {
        //11 first numb of Fibonacci
        int result = 0;
        int numbefore = 0;
        int num = 1;
        System.out.print(numbefore + " ");
        for (int counter = 0; counter < 10; counter++) {

            result = num + numbefore;//1
            System.out.print(result + " ");//1
            num = numbefore;
            numbefore = result;

        }
        System.out.println();
    }

    public static void task13() {
        //read and try to understand (math-econom task)
        float sum = 0;
        System.out.println("Enter sum: ");
        sum = getInput().nextFloat();
        System.out.println("Enter amount of months: ");
        int month = getInput().nextInt();
        for (int i = 0; i < month; i++)
            sum = (float) (sum*1.07);
        System.out.println("Money you get in " + month + " months: " + sum);
    }

    public static void task14() {
        //sout multiplication table
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        System.out.println("Task 1-5 - constructions, task 6-11 - operators, task 12-14 - additional tasks, 0 - leave.");
        while (true) {
            System.out.println("Enter number of task: ");
            choice = getInput().nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;
                case 8:
                    task8();
                    break;
                case 9:
                    task9();
                    break;
                case 10:
                    task10();
                    break;
                case 11:
                    task11();
                    break;
                case 12:
                    task12();
                    break;
                case 13:
                    task13();
                    break;
                case 14:
                    task14();
                    break;
            }
        }
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

}