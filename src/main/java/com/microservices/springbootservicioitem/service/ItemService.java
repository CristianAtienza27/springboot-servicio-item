package com.microservices.springbootservicioitem.service;

import com.microservices.springbootservicioitem.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();
    Item findById(Long id, Integer cantidad);
}
