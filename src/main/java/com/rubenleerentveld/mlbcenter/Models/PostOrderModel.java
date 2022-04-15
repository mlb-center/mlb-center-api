package com.rubenleerentveld.mlbcenter.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

public class PostOrderModel {

    @JsonProperty("orderDate")
    private String orderDate;

    @JsonProperty("customerId")
    private String customerId;

    public PostOrderModel(){

    }

    public PostOrderModel(String customerId, String orderDate){
        this.customerId = customerId;
        this.orderDate = orderDate;
    }


    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }




}
