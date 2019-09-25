package com.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface OrderMaster {
    Map getAllOrders();
}