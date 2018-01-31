package com.company;

import uzdaviniai.LyginisNelyginis;

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

        LyginisNelyginis objektas = new LyginisNelyginis();

        objektas.setA(a);

        System.out.println("Ivesta skaicius: "+objektas.getA());
        objektas.skaiciuok();
    }
}
