package com.random.address.util;



/**
 * @author moris
 *
 */
public enum State {

    AK("AK", "Alaska"),
    HI("HI", "Hawaii"),
    ME("ME", "Maine"),
    MS("MS", "Mississippi"),
    FL("FL", "Florida"),
    GA("GA", "Georgia"),
    LA("LA", "Louisiana"),
    NV("NV", "Nevada"),
    NH("NH", "New Hampshire"),
    NY("NY", "New York"),
    OR("OR", "Oregon"),
    PA("PA", "Pennsylvania"),
    TN("TN", "Tennessee"),
    TX("TX", "Texas"),
    WA("WA", "Washington");

    private final String code;
    private final String state;

    State(String code, String state) {
        this.code = code;
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

}
