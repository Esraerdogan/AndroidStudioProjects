package com.erdoganesra.javalearning;

public class Statements {

    public static void main(String[] args){

        int x = 5;
        System.out.println(x);

        x = x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        x = x * 5;
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);
        System.out.println(y>x);

        y = 30;
        System.out.println(x>y);
        System.out.println(x>=y);

        System.out.println(x==y);
        System.out.println(x!=y);

        // and && or ||

        x = 30;
        y = 30;
       int z = 5;

        System.out.println(x<y || z<y);

        // if statements

        if (x < y){
            System.out.println("y is bigger");
        }else if (y < x){
            System.out.println("x is bigger");
        }else{
            System.out.println("x equals y");
        }

        //switch

        int day = 2;
        String dayString = "";

        if (day == 1){
            dayString = "Monday";
        }else if (day ==2){
            dayString = "Tuesday";
        }else if (day == 3){
            dayString = "Wednesday";
        }else if (day ==4){
            dayString = "Thursday";
        }else if (day == 5){
            dayString = "Friday";
        }else if (day ==6){
            dayString = "Saturday";
        }else{
            dayString = "Sunday";
        }

        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);

    }
}
