package com.random.address.service;

import com.random.address.model.Address;
import org.springframework.stereotype.Service;



/**
 * @author moris
 *
 */
public interface AddressGenService {

    /**
     * Returns the Address object with some random address fields
     * @return
     */
    Address generateAddress();

}
