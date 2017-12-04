package com.kodilla.stringexercises;
/*

Napisz metodę, która sprawdza czy w przekazanej jako parametr liście
występuje 10 i 20 jeden po drugim w tej kolejnosci, np: [0,10,8,20] -> TAK.
[0,8,20,10]-> nie

 */
public class CheckList {
    public boolean Print(int[] numbers) {
        boolean is1020InList=false;

        for(int i=0; i<numbers.length;++i) {
           int j=i;
            if(numbers[j]==10) {
                if (numbers[++j]==20) {
                   is1020InList=true;
                }
            }
        }
            return is1020InList;

    }
    public static void main(String[] args) {

        CheckList print = new CheckList();
         int[] board= {10,2,10,20};

        System.out.println(print.Print(board));

    }


}
