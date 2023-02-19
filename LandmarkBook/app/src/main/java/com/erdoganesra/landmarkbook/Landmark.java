package com.erdoganesra.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String country;
    int image;

    //Constructor

    public Landmark(String name, String county, int image){
        this.name = name;
        this.country = county;
        this.image = image;
    }
}
