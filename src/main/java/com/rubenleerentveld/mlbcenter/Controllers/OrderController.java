package com.rubenleerentveld.mlbcenter.Controllers;

import com.rubenleerentveld.mlbcenter.Models.NewOrderModel;
import com.rubenleerentveld.mlbcenter.Models.PostOrderModel;
import com.rubenleerentveld.mlbcenter.Services.OrderService;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@ImportAutoConfiguration
public class OrderController {
    OrderService service;

    public OrderController(){
        service = new OrderService();
    }

    @PostMapping(value = "/PlaceOrder", consumes = {"application/json"})
    public PostOrderModel PlaceOrder(@RequestBody PostOrderModel order){


        //return new ResponseEntity<>("Order placed for: " + model.getOrderDate(), HttpStatus.OK);
        return order;
    }

}
