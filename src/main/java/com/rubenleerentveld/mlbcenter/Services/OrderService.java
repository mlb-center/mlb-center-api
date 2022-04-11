package com.rubenleerentveld.mlbcenter.Services;

import com.rubenleerentveld.mlbcenter.MessageBroker.OrderBrokerService;
import com.rubenleerentveld.mlbcenter.Models.NewOrderModel;

public class OrderService {
    OrderBrokerService broker;

    public OrderService(){
        broker = new OrderBrokerService();
    }

    public void PlaceOrder(NewOrderModel model){
        broker.PlaceOrder(model);
    }

}
