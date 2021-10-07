package cz.uhk.pro2.models;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private int postCode;
    private List<CityPerson> list = new ArrayList<>();

    public City(String name, int postCode) {
        this.name = name;
        this.postCode = postCode;
    }


}
