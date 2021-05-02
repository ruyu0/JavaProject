package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Category;
import pojo.Product;
import pojo.Product2;
import pojo.Product3;
import pojo.ProductService;
import service.ProductService2;

public class Test {
	public static void main(String args[]) {
//		//TODO：演示Spring获取对象,注入值
//		ApplicationContext a1 = new ClassPathXmlApplicationContext(new String[] {"applicationContext1.xml"});
//		Category b1 = (Category)a1.getBean("c");
//		System.out.println("Spring获取的对象" + b1);
//		//TODO:演示获取对象中注入对象
//		Product a2 = (Product)a1.getBean("product");
//		System.out.println("Spring获取的对象" + a2);
//		//与前面的演示的获取对象相同
//		System.out.println("Spring获取的对象中注入的对象" + a2.getCategory());
//		
//		//TODO:用注解的方式注入对象(对比上一个例子已经修改了xml配置文件）
//		//使用applicationContext2.xml
//		ApplicationContext a3 = new ClassPathXmlApplicationContext(new String[] {"applicationContext2.xml"});
//		Product2 b3 = (Product2)a3.getBean("product2");
//		System.out.println("Spring获取的对象" + b3);
//		//与前面的演示的获取对象相同
//		System.out.println("Spring获取的对象中注入的对象" + b3.getCategory2());
//		
//		//TODO:对Bean进行注解
//		ApplicationContext a31 = new ClassPathXmlApplicationContext(new String[] {"applicationContext3.xml"});
//		Product3 b31 = (Product3)a31.getBean("product3");
//		//这个方法可用不用命名Product3的bean
////		Product3 b31 = (Product3)a31.getBean(Product3.class);
//		System.out.println("Spring获取的对象" + b31);
//		//与前面的演示的获取对象相同
//		System.out.println("Spring获取的对象中注入的对象" + b31.getCategory3());
		
//		//TODO:10.4 演示AOP
//		ApplicationContext a4 = new ClassPathXmlApplicationContext(new String[]{"applicationContextAOP.xml"});
//		ProductService b4 = (ProductService)a4.getBean("productService");
//		b4.dosomeService();
//		b4.queryDatabase();
		
		//TODO:10.5 注解方式AOP
		ApplicationContext a5 = new ClassPathXmlApplicationContext(new String[] {"applicationContextAOP2.xml"});
		ProductService2 b5 = (ProductService2)a5.getBean("productService2");
		b5.queryDatabase();
		
	}
}
