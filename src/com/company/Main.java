package com.company;
import java.util.Scanner;

public class Main {

    static void TaskNo1() {
       Scanner input=new Scanner(System.in);
        System.out.println("a= ");
        short a=input.nextShort();
        System.out.println("b= ");
        short b= input.nextShort();

        if (a < b) {
            System.out.println(a + " is the smallest value.");
        }
        if (b > a) {
            System.out.println(b + " is the largest value.");
        } else {
            System.out.println(a + "is equal to" + b);
        }
        if (!(a == b)) {
            System.out.println(a + " is not equal to " + b);
        }
        if (a > 0) {
            System.out.println(a + " is positive.");
        } else {
            System.out.println(a + " is negative.");
        }
        if (b > 0) {
            System.out.println(b + " is positive.");
        } else {
            System.out.println(b + " is negative.");
        }
        if (a < 100) {
            System.out.println(a + " is less than 100.");
        }
        if (b < 100) {
            System.out.println(b + " is less than 100.");
        }
        if (a%2==0) {
            System.out.println(a + " is an even number.");
        }
        else
        {
            System.out.println(a+" is an odd number.");}
        if (b % 2 == 0){
            System.out.println(b+" is an even number");
        }
        else {
            System.out.println(b + " is an odd number.");
        }
    }


        public static void main (String[]args){
            TaskNo1();
            TaskNo2();
            TaskNo3();
            TaskNo4();
            TaskNo5();
        }
        static void TaskNo2 () {

        int time=5;
        if (time<12&&time>=0)
        {
            System.out.println("Good morning Sunshine!");}
        else if (time<19&&time>=0)
        {
            System.out.println("Good Afternoon. Work Hard!");}
        else if (time>19&&time<=24)
        {
            System.out.println("Good Evening. Get some rest!");}
        else
        {
            System.out.println("Invalid time format!");}

        }

        static void TaskNo3 () {
            Scanner dateInput = new Scanner(System.in);
            System.out.print("Please write the day: ");
            int day = dateInput.nextInt();
            System.out.print("Please write the month: ");
            int month = dateInput.nextInt();
            System.out.print("Please write the year: ");
            int year = dateInput.nextInt();
            System.out.print("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD: ");
            int userAnswerFormat = dateInput.nextInt();
                if (day<0 || month<0 || year<0){
                    System.out.println("Date cannot contain negative values! Please, use positive values!");
                } else if (day>29 && (month==2)) {
                    System.out.println("February does not contain more than 28 days usually or 29 days in leap year!");
                } else if (day>30 && (month==4 || month==6 || month==9 || month==11)){
                    System.out.println("This month does not contain more than 30 days!");
                } else if (day>31 ){
                    System.out.println("Months does not contain more than 31 day!");
                } else if (month>12){
                    System.out.println("Year does not contain more than 12 months!");
                } else{
                    switch (userAnswerFormat) {
                        case 1:
                            System.out.print("Your format is " + year + "/" + month + "/" + day);
                            break;
                        case 2:
                            System.out.print("Your format is " + year + "." + month + "." + day);
                            return;
                    }
                }
            }
          static void TaskNo4 () {
              short dayNumber;

              Scanner input = new Scanner(System.in);
              System.out.print("Please write a number: ");
              dayNumber = input.nextShort();

              if (dayNumber <= 0 || dayNumber > 365) {
                  System.out.println("Invalid number range; please input a number from 1 to 365");
              } else
                  System.out.println("The day number is: " + dayNumber);
              if (dayNumber > 0 && dayNumber <= 31) {
                  System.out.println("It is: January");
              } else if (dayNumber > 31 && dayNumber <= 59) {
                  System.out.println("It is: February");
              } else if (dayNumber > 59 && dayNumber <= 90) {
                  System.out.println("It is: March");
              } else if (dayNumber > 90 && dayNumber <= 120) {
                  System.out.println("It is: April");
              } else if (dayNumber > 120 && dayNumber <= 151) {
                  System.out.println("It is: May");
              } else if (dayNumber > 151 && dayNumber <= 181) {
                  System.out.println("It is: June");
              } else if (dayNumber > 181 && dayNumber <= 212) {
                  System.out.println("It is: July");
              } else if (dayNumber > 212 && dayNumber <= 243) {
                  System.out.println("It is: August");
              } else if (dayNumber > 243 && dayNumber <= 273) {
                  System.out.println("It is: September");
              } else if (dayNumber > 273 && dayNumber <= 304) {
                  System.out.println("It is: October");
              } else if (dayNumber > 304 && dayNumber <= 334) {
                  System.out.println("It is: November");
              } else if (dayNumber > 334 && dayNumber <= 365) {
                  System.out.println("It is: December");
              }
          }
          static void TaskNo5 () {
                  Scanner input = new Scanner(System.in);
                  System.out.print("Please enter the number of hours worked: ");
                  short workingHoursInDay = input.nextShort();
                  int salary;

                  if (workingHoursInDay < 0 || workingHoursInDay > 24) {
                      System.out.println("Invalid number! Please enter correct number.");
                  } else {
                      if (workingHoursInDay <= 8) {
                          salary = workingHoursInDay * 10;
                      } else {
                          salary = 80 + (workingHoursInDay - 8) * 15;
                      }
                      System.out.println("Your salary is " + salary + ".");
                  }
              }
          }


