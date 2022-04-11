package com.rubenleerentveld.mlbcenter.Controllers;

import com.rubenleerentveld.mlbcenter.Models.NewOrderModel;
import com.rubenleerentveld.mlbcenter.Services.OrderService;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ImportAutoConfiguration
public class OrderController {
    OrderService service;

    public OrderController(){
        service = new OrderService();
    }

    @PostMapping("/PlaceOrder")
    public ResponseEntity<?> PlaceOrder(NewOrderModel model){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
