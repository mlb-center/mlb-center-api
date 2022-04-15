package com.rubenleerentveld.mlbcenter.Models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;

public class NewOrderModel {

    String customerId;

    @JsonFormat(pattern = "yyyy/MM/dd")
    LocalDate orderDate;

    Array productIds;

    public NewOrderModel(String customerId, LocalDate orderDate){
        this.customerId = customerId;
        this.orderDate = orderDate;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Array getProductIds() {
        return productIds;
    }

    public void setProductIds(Array productIds) {
        this.productIds = productIds;
    }





}
