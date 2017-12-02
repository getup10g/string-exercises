package com.kodilla.stringexercises;

/*
1. Napisz metodę, która przyjmie jako parametr Stringa, a zwróci „odwrócony”
napis. Np dla Ksiazka -> akzaisK
*/


public class PrintBackwards {
     public String Print(String word)
     {
         String bword ="";
         for(int i=1; i<=word.length();i++) {
             bword+=word.charAt(word.length()-i);
         }
         return bword;
     }
    public static void main(String[] args) {

        PrintBackwards print = new PrintBackwards();
        System.out.println(print.Print("zygzak"));
    }
}



