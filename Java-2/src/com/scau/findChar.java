package com.scau;

import java.util.Scanner;

public class findChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String pattern = input.next();

        for (int i = 0; i < pattern.length(); i++) {
            int count = 1;
            char ch = pattern.charAt(i);
            i++;
            while (count < n && i < pattern.length()) {
                if (ch == pattern.charAt(i)) {
                    i++;
                    count++;
                } else {
                    i--;
                    break;
                }
            }
            if (count >= n) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No");
    }
}
