package com.random.address.util;


/**
 * @author moris
 *
 */
public enum Country {

    US("US", "US"),
    CA("CA", "Canada"),
    MX("MX", "Mexico"),
    NH("NH", "Netherlands");

    private final String code;
    private final String country;

    Country(String code, String country) {
        this.code = code;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

}
