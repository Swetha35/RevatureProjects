package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.model.OrderItem;
import com.webapp.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}

}
