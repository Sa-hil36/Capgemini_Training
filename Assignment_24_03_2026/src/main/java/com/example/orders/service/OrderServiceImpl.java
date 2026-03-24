package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository repo;

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity order = OrderMapper.toEntity(request);
        Double total = request.getPricePerUnit()*request.getQuantity();
        order.setTotalAmount(total);
        return repo.save(order);

    }

    @Override
    public OrderEntity getOrderById(Long id) {
        Optional<OrderEntity> order = repo.findById(id);
        if (order.isEmpty()) {
            throw new OrderNotFoundException();
        } else {
            return order.get();
        }
    }

    @Override
    public void deleteOrder(Long id) {
        Boolean check = repo.existsById(id);
        if (!check) {
            throw new OrderNotFoundException();
        }
        repo.deleteById(id);
    }
}
