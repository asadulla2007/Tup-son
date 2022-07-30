package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 7;
        int count = 0; // bo'luvchilar soni

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }























    }
}
