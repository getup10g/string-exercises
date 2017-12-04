package com.kodilla.stringexercises;

/*

Napisz metodę sprawdzającą, czy dane hasło ma min. 6 znaków, min. 1 dużą
literę, min. 1 małą literę, min. 1 znak spcjalny, min. 1 cyfrę. Zwraca true/false.
 */
public class CheckPassword {

    public boolean checking(String password) {
        boolean isCorrect = false;
        boolean helper = false;
        int x = 0;
        int y = 0;
        if (password.length() >= 6) {
            do {
                OUTER_LOOP:
                for (int i = 0; i < password.length(); ++i) {
                    if (x == 0 && Character.isLowerCase(password.charAt(i))) {
                        helper = true;
                        x = 1;
                    }
                    if (x == 1 && Character.isUpperCase(password.charAt(i))) {
                        helper = true;
                        x = 2;
                    }
                    if (x == 2 && Character.isDigit(password.charAt(i))) {
                        helper = true;
                        x = 3;
                    }
                    if (x == 3) {
                        String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "{", "}", "[", "]", "|", ":", ",", "'", "<", ">", "?", ",", ".", "/"};
                        for (int z = 0; z < specialCharacters.length; ++z) {
                            for (int j = 0; j < password.length(); ++j) {
                                String character = "";
                                character += password.charAt(j);
                                if (specialCharacters[z].equals(character)) {
                                    x = 4;
                                    isCorrect = true;
                                    break OUTER_LOOP;
                                }
                            }
                        }
                    }
                    if (x == 4) {

                    }
                }
                ++y;
            } while (y < password.length());
        }
        return isCorrect;
    }

    public static void main(String[] args) {

        CheckPassword print = new CheckPassword();
        System.out.println(print.checking("MyPasswordIs4M3^^"));

    }
}

