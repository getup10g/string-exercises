package com.kodilla.stringexercises;
/*
Napisz metodę sprawdzającą, czy podana liczba jest potęgą 4
 */
public class Exponentiation {

    public boolean Print(int number) {
        boolean isNumberExponationOf4=false;
        int four=4;
        double exponation=0;
        for(int i=1; exponation<=number;++i) {
            exponation=Math.pow(four, i);
            if(exponation==number) {
                isNumberExponationOf4=true;
                }
            }
            return isNumberExponationOf4;


    }
    public static void main(String[] args) {

        Exponentiation print = new Exponentiation();

        System.out.println(print.Print(256));

    }
}
