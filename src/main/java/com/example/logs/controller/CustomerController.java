package com.example.logs.controller;

import com.example.logs.dto.CustomerDTO;
import com.example.logs.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger("customer");

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        LOGGER.info("request  - POST | customer | saveCustomer | payload : {}",customerDTO);
        customerService.saveCustomer(customerDTO);
        LOGGER.info("response - POST | customer | saveCustomer | success");
    }
}
