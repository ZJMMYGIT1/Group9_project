package group9.mapper;

import java.util.List;

import group9.domain.Order;

public interface OrderMapper {
	public List<Order> selectAll();
	public void deleteById(Integer id);
}
