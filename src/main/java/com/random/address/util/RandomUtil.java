package com.random.address.util;

import org.springframework.stereotype.Component;

import java.util.Random;



/**
 * @author moris
 *
 */
@Component
public class RandomUtil {

    private static Random random = new Random();

    /**
     * Returns a random text with the length as passed in the request parameter.
     *
     * @param targetStringLength
     * @return
     */
    public String getRandomAlphaNumericString(int targetStringLength) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    /**
     * Returns a random text as a county
     *
     * @return
     */
    public String getCounty() {
        String text = getRandomAlphaNumericString(6);
        return new StringBuilder()
                .append(text.substring(0, 1).toUpperCase())
                .append(text.substring(1).toLowerCase())
                .toString();
    }

    /**
     * Returns a random city available in states list
     *
     * @return
     */
    public String getCity() {
        return AddressConstants.cities.get(random.nextInt(14));
    }

    /**
     * Returns a random text as a house address
     *
     * @return
     */
    public String getHouseAddress() {
        return new StringBuilder(Integer.toString(random.nextInt(1000) + 1))
                .append(" ")
                .append(getRandomAlphaNumericString(random.nextInt(6) + 1).toUpperCase())
                .toString();
    }

    /**
     * Returns a random Street available in the streets list
     *
     * @return
     */
    public String getStreet() {
        return AddressConstants.streets.get(random.nextInt(20));
        //Integer.toString(random.nextInt(10000) + 1);
    }

    /**
     * Returns a random postal code
     *
     * @return
     */
    public String getPostalCode() {
        return Integer.toString((1 + random.nextInt(2)) * 10000 + random.nextInt(10000));
    }

    /**
     * Returns a random state available in states list
     *
     * @return
     */
    public State getState() {
        return AddressConstants.states.get(random.nextInt(15));
    }

    /**
     * Returns a random country with corresponding code available in the Countries list
     *
     * @return
     */
    public Country getCountry() {
        return AddressConstants.countries.get(random.nextInt(4));
    }
}
