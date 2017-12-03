package com.kodilla.stringexercises;

public class PrintSum {
    /*Napisz metodę, która ma 1 argument - String. Sprawdz czy ten String jest
    numerem (np. „25”), jeśli nie, to rzuca wyjątek. Jeśli jest numerem, to drukuje sumę
    cyfr.*/
        public int Print() {
            int sum=0;
            String number ="25";
            int isANumber=Integer.parseInt(number);
            for(int i=1; i<=number.length();i++) {
                sum +=number.charAt(number.length()-i)-'0';
            }
            return sum;
        }
        public static void main(String[] args) {
            PrintSum print = new PrintSum();
            System.out.println(print.Print());
        }
    }

