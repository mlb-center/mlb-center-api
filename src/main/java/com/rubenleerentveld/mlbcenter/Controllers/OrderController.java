package com.rubenleerentveld.mlbcenter.Controllers;

import com.rubenleerentveld.mlbcenter.MessageBroker.MessagingConfig;
import com.rubenleerentveld.mlbcenter.Models.PostOrderModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ImportAutoConfiguration
public class OrderController {
    //private OrderService service;
    @Autowired
    private RabbitTemplate template;

//    public OrderController(){
//        service = new OrderService();
//    }

    @PostMapping(value = "/PlaceOrder", consumes = {"application/json"})
    public ResponseEntity PlaceOrder(@RequestBody PostOrderModel order){
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, order);
        return new ResponseEntity<>("Order placed for: " + order.getOrderDate(), HttpStatus.OK);
    }

}
