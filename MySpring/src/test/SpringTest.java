package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.ProductService2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextAOP2.xml")
public class SpringTest {
	@Autowired
	ProductService2 ps2;
	
	@Test
	public void test() {
		ps2.queryDatabase();
	}
}
