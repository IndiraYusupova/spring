package com.onetomany.spring.controller;


import com.onetomany.spring.Dto.OrderRequest;
import com.onetomany.spring.Dto.OrderResponse;
import com.onetomany.spring.entity.Customer;
import com.onetomany.spring.repository.CustomerRepository;
import com.onetomany.spring.repository.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "Controller to illustrate operation Swagger")
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    @ApiOperation("save request")

    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/findAllOrders")
    @ApiOperation("Getting a list of orders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    @GetMapping("/getInfo")
    @ApiOperation("Getting complete information")
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }


}

