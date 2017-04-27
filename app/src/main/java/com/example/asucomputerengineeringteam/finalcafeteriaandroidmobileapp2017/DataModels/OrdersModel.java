package com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.DataModels;

import android.location.Location;

import java.sql.Time;
import java.util.Calendar;

import static android.R.attr.id;

//import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Esraa Hosny on 3/11/2017.
 */

public class OrdersModel {
    private int Id;
    private boolean PaymentDone;
    private Time OrderTime;
    private String PaymentMethod;
    private String DeliveryPlace;
    private String OrderStatus;
    private Time DeliverytTime;
    private int customerid;
//    private Customer customer;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isPaymentDone() {
        return PaymentDone;
    }

    public void setPaymentDone(boolean paymentDone) {
        PaymentDone = paymentDone;
    }

    public Time getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Time orderTime) {
        OrderTime = orderTime;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getDeliveryPlace() {
        return DeliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        DeliveryPlace = deliveryPlace;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public Time getDeliverytTime() {
        return DeliverytTime;
    }

    public void setDeliverytTime(Time deliverytTime) {
        DeliverytTime = deliverytTime;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}