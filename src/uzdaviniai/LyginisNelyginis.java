package uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    public LyginisNelyginis(){
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
