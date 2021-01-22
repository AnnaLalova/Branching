package com.company;

public class Main {

    static void TaskNo1() {
        short a = 5;
        short b = 83;
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
        }
    }

