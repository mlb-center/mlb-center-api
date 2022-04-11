package com.rubenleerentveld.mlbcenter.MessageBroker;

import com.rubenleerentveld.mlbcenter.Models.NewOrderModel;
import org.springframework.boot.r2dbc.ConnectionFactoryBuilder;

public class OrderBrokerService {
    private final static String queuename = "order";
    

    public OrderBrokerService(){

    }

    public void PlaceOrder(NewOrderModel model){

    }
}
