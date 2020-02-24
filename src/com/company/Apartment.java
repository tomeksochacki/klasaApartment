package com.company;

import java.util.LinkedList;

public class Apartment {
    //co zawiera apartment?
    private String city;

    private float area;

    private float princePerMeter;

    public Apartment(String city, float area, float princePerMeter) {
        this.city = city;
        this.area = area;
        this.princePerMeter = princePerMeter;
    }

    public float getFullPrince(){
    return 0.95f*area*princePerMeter;
    }

    public String getCity() {
        return city;
    }

    //psvm
    public static void main(String[]args){
        //ctrl + d = kopiowanie linii
        LinkedList<Apartment> apartments = new LinkedList<>();
        apartments.add(new Apartment("Warszawa", 50f, 10000.0f ));
        apartments.add(new Apartment("Kraków", 50f, 8000.0f ));
        apartments.add(new Apartment("Lublin", 58f, 4000.0f ));
        for ( Apartment apartment: apartments){
            System.out.println("Apartment in " + apartment.getCity() + " costs "+ apartment.getFullPrince());
        }

    }
}
