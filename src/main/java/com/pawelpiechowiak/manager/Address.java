package com.pawelpiechowiak.manager;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address(Geo geo) {
        this.geo = geo;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return geo;
    }
}
