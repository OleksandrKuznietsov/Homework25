package com.example.homework25.controller;

import com.example.homework25.model.Order;
import com.example.homework25.service.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    @GetMapping("/getOrderById")
    public Order getOrderById(@RequestParam int id) {
        return orderRepository.getOrderById(id);
    }

    @GetMapping("/getOrders")
    public Map<Integer, Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody Order order) {
        orderRepository.addOrder(order);
    }

}
