package com.dn.application.MayTest;

import java.util.Random;

public class PasswordGenerator {

    public static String passwordGenerator(int len){

        final String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890{}";

        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String password;
        int c = 0;
        for(int i = 0; i < len; i++){

            c = random.nextInt(str.length());
            stringBuilder.append(str.charAt(c));

        }

        password = stringBuilder.toString();
        return password;
    }

    public static void main(String[] args) {
        System.out.println(PasswordGenerator.passwordGenerator(10));

    }
}
