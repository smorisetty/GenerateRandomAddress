package com.random.address.controller;

import com.random.address.model.Address;
import com.random.address.service.AddressGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moris
 *
 */
@RestController
public class AddressGenController {

    @Autowired
    private AddressGenService addressGenService;

    @GetMapping("/randomizer/address")
    public ResponseEntity<Address> generateAddress() {
        return ResponseEntity.ok(addressGenService.generateAddress());
    }
}
