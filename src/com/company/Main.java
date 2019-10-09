package com.company;

import com.company.Int;

public class Main {

    public static void main(String[] args) {
        Int a = new Int(4);

        System.out.println("Valeur : " + a);
        a.setValue(10);
        System.out.println("Valeur modifiée: " + a);
        System.out.println("To string: " + a.toString());
    }
}
