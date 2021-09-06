package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tal1 = new Scanner (System.in);
        System.out.println("skriv et tal mellem 1 og 10");
        int tala = tal1.nextInt();
        System.out.println("dit første tal er: "+ tala);
        Scanner tal2 = new Scanner (System.in);
        System.out.println("skriv et tal mellem 1 og 10");
        int talb = tal2.nextInt();
        System.out.println("dit andet tal er: "+ talb);
        if(tala==talb) System.out.println("a=b");
        else System.out.println("a!=b");
    }
}
