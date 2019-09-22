package group9.service;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import group9.domain.Order;
import group9.mapper.OrderMapper;

@Component("OrderServiceImpl")
public class OrderServiceImpl implements OrderService{
	
	@Resource
	OrderMapper ordermapper;

	@Override
	public List<Order> selectAll() {
		List<Order> list = ordermapper.selectAll();
		return list;
	}

	@Override
	public void deleteById(Integer id) {
		ordermapper.deleteById(id);
	}
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml",
				"spring/applicationContext-service.xml");
		SqlSessionFactory bean = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
		SqlSession session = bean.openSession();
		
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<Order> list = mapper.selectAll();
		Iterator<Order> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
