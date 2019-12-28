package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

	@Autowired
	ProductServiceImpl productService;

	@Test
	void contextLoads() {
		System.out.println(productService.getById(1));
	}

}
