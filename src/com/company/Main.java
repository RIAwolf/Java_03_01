package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Parašyti programą,
        * kuri leistų vartotojui įvesti norimą skaičių
        * ir po to parašytų ar šis skaičius yra lyginis ar ne lyginis.
        * Užuomina panaudokite % operatoriu.
        * */

        System.out.println("Iveskite sveika skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }
    }
}
