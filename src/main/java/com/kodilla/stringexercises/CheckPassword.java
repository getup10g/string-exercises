package com.kodilla.stringexercises;
/*

Napisz metodę sprawdzającą, czy dane hasło ma min. 6 znaków, min. 1 dużą
literę, min. 1 małą literę, min. 1 znak spcjalny, min. 1 cyfrę. Zwraca true/false.
 */
public class CheckPassword {

    public boolean checking(String password) {
        boolean isCorrect = false;
        boolean helper = false;
        int x=0;
                do{
                    for (int i = 1; i <= password.length(); ++i) {
                         if(x==0&&Character.isLowerCase(password.charAt(i))) {
                            helper = true;
                            x=1;
                            break;
                            }
                        if (x==1&&Character.isUpperCase(password.charAt(i))) {
                            helper=true;
                            x=2;
                            break;
                            }
                        if (x==2&&Character.isDigit(password.charAt(i))) {
                            helper=true;
                            x=3;
                            break;
                            }
                        if (x==3) {
                           String[] specialCharactercs ={"!","@","#","$","%","^","&","*","(",")","{","}","[","]","|",":",",","'","<",">","?",",",".","/"};
                            for(int z =0;z<specialCharactercs.length;++z){
                                for(int j =0;j<password.length();++j){
                                    String character="";
                                    character+=password.charAt(j);
                                    if(specialCharactercs[z]==character){
                                        helper = true;
                                        x = 4;
                                        isCorrect=true;
                                        break;
                                    }
                                }
                            }

                            }
                        }
                }while(helper);
                return isCorrect;
    }
    public static void main(String[] args) {

        CheckPassword print = new CheckPassword();
        System.out.println(print.checking("JavaJ3st66^^"));
    }
}

