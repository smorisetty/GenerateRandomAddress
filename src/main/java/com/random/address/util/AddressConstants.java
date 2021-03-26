package com.random.address.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This file maintains all the standard constants which will be used while generating an address.
 */

/**
 * @author moris
 *
 */
public class AddressConstants {

    public static final Map<Integer, Country> countries = new HashMap<>();

    static {
        int index = 0;
        for (Country c : Country.values()) {
            countries.put(index++, c);
        }
    }

    public static final Map<Integer, State> states = new HashMap<>();

    static {
        int index = 0;
        for (State s : State.values()) {
            states.put(index++, s);
        }
    }

    public static final List<String> streets = new ArrayList<>();

    static {
        streets.add("532 Union St.");
        streets.add("5803 State Rd #40");
        streets.add("Tern St.");
        streets.add("33 Morning Star Cir");
        streets.add("Library St.");
        streets.add("19615 19th Avenue Ct E");
        streets.add("234 Federal St., 72A");
        streets.add("Federal St.");
        streets.add("1/2A, St.center");
        streets.add("4763  Jones st");
        streets.add("234 Federal St., 72A");
        streets.add("215 Gates Ln, East Freedom");
        streets.add("100 Rock Haven Rd #APT D106");
        streets.add("1808 Union Rd, left st.");
        streets.add("518 Aurora Dr, Claremont");
        streets.add("200 Knolls Rd, Williamstown");
        streets.add("Sketch Rd, West");
        streets.add("11533 Korea Rd");
        streets.add("5803 State Rd #40, Bruce");
        streets.add("33 Morning Star Cir, Woodland Park");
    }


    public static final List<String> cities = new ArrayList<>();

    static {
        cities.add("Newark");
        cities.add("Jersey City");
        cities.add("Elizabeth");
        cities.add("Paterson");
        cities.add("Clifton ");
        cities.add("Camden");
        cities.add("San Diego");
        cities.add("San Jose");
        cities.add("San Francisco");
        cities.add("Fresno");
        cities.add("Oakland");
        cities.add("Long Beach");
        cities.add("Philadelphia");
        cities.add("Pittsburgh");
        cities.add("Bethlehem");

    }

}
