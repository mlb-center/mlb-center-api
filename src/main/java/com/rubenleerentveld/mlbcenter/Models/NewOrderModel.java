package com.rubenleerentveld.mlbcenter.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class NewOrderModel {

    String customerId;
    Date orderDate;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Array getProductIds() {
        return productIds;
    }

    public void setProductIds(Array productIds) {
        this.productIds = productIds;
    }

    Array productIds;



}
