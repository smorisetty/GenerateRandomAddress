package com.random.address.service;

import com.random.address.model.Address;
import com.random.address.util.Country;
import com.random.address.util.RandomUtil;
import com.random.address.util.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author moris
 *
 */

@Service
public class AddressGenServiceImpl implements AddressGenService {

    @Autowired
    private RandomUtil randomUtil;

    
    @Override
    public Address generateAddress() {

        Country country = randomUtil.getCountry();
        State state = randomUtil.getState();

        Address address = new Address();
        address.setState(state.getState());
        address.setStateCode(state.getCode());
        address.setCity(randomUtil.getCity());
        address.setCountry(country.getCountry());
        address.setCountryCode(country.getCode());
        address.setCounty(randomUtil.getCounty());
        address.setStreet(randomUtil.getStreet());
        address.setHouse(randomUtil.getHouseAddress());
        address.setPostalCode(randomUtil.getPostalCode());

        return address;
    }

}
