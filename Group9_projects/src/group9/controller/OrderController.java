package group9.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import group9.domain.Order;
import group9.service.OrderService;
import net.sf.json.JSONArray;

@Controller
public class OrderController {

	@Resource
	OrderService orderService;

	@ResponseBody
	@RequestMapping("/order.action")
	public void selectOrderList(HttpServletResponse resp) throws IOException {
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
//		String ori = pictureFile.getOriginalFilename();
//		String picName = UUID.randomUUID().toString();
//		String last = ori.substring(ori.lastIndexOf("."));
//		pictureFile.transferTo(new File("C:\\img\\"+picName+last));
//		order.setOrder_item(picName+last);
		List<Order> list = orderService.selectAll();
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray + "1111111111111");
		String str = jsonArray.toString();
		resp.getWriter().write(str);
	}

	@ResponseBody
	@RequestMapping("/delete.action")
	public String deleteOrder(Integer id) {
		if (id == null) {
			return "error";
		}else {
			orderService.deleteById(id);
			return "success";
		}
	}

}
