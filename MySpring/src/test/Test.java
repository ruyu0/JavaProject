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
//		//TODO����ʾSpring��ȡ����,ע��ֵ
//		ApplicationContext a1 = new ClassPathXmlApplicationContext(new String[] {"applicationContext1.xml"});
//		Category b1 = (Category)a1.getBean("c");
//		System.out.println("Spring��ȡ�Ķ���" + b1);
//		//TODO:��ʾ��ȡ������ע�����
//		Product a2 = (Product)a1.getBean("product");
//		System.out.println("Spring��ȡ�Ķ���" + a2);
//		//��ǰ�����ʾ�Ļ�ȡ������ͬ
//		System.out.println("Spring��ȡ�Ķ�����ע��Ķ���" + a2.getCategory());
//		
//		//TODO:��ע��ķ�ʽע�����(�Ա���һ�������Ѿ��޸���xml�����ļ���
//		//ʹ��applicationContext2.xml
//		ApplicationContext a3 = new ClassPathXmlApplicationContext(new String[] {"applicationContext2.xml"});
//		Product2 b3 = (Product2)a3.getBean("product2");
//		System.out.println("Spring��ȡ�Ķ���" + b3);
//		//��ǰ�����ʾ�Ļ�ȡ������ͬ
//		System.out.println("Spring��ȡ�Ķ�����ע��Ķ���" + b3.getCategory2());
//		
//		//TODO:��Bean����ע��
//		ApplicationContext a31 = new ClassPathXmlApplicationContext(new String[] {"applicationContext3.xml"});
//		Product3 b31 = (Product3)a31.getBean("product3");
//		//����������ò�������Product3��bean
////		Product3 b31 = (Product3)a31.getBean(Product3.class);
//		System.out.println("Spring��ȡ�Ķ���" + b31);
//		//��ǰ�����ʾ�Ļ�ȡ������ͬ
//		System.out.println("Spring��ȡ�Ķ�����ע��Ķ���" + b31.getCategory3());
		
//		//TODO:10.4 ��ʾAOP
//		ApplicationContext a4 = new ClassPathXmlApplicationContext(new String[]{"applicationContextAOP.xml"});
//		ProductService b4 = (ProductService)a4.getBean("productService");
//		b4.dosomeService();
//		b4.queryDatabase();
		
		//TODO:10.5 ע�ⷽʽAOP
		ApplicationContext a5 = new ClassPathXmlApplicationContext(new String[] {"applicationContextAOP2.xml"});
		ProductService2 b5 = (ProductService2)a5.getBean("productService2");
		b5.queryDatabase();
		
	}
}
