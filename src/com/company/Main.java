package com.company;

import com.company.templatemethod.Hoagie;
import com.company.templatemethod.ItalianHoagie;
import com.company.templatemethod.VeggieHoagie;

public class Main {

    public static void main(String[] args) {

        Hoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println("\n");

        Hoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }

}