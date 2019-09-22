package group9.service;

import java.util.List;

import group9.domain.Order;

public interface OrderService {
	public List<Order> selectAll();
	public void deleteById(Integer id);
}
