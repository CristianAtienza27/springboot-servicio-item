package com.microservices.springbootservicioitem.service;

import com.microservices.springbootservicioitem.models.Item;
import com.microservices.springbootservicioitem.models.Producto;

import java.util.List;

public interface ItemService {

    List<Item> findAll();
    Item findById(Long id, Integer cantidad);

    Producto save(Producto producto);

    Producto update(Producto producto, Long id);

    void delete(Long id);
}
