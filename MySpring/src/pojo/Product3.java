package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("product3")
public class Product3 {
	private String name = "Product";
	
	//注解注入对象
	@Autowired
	private Category3 category3;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCategory3(Category3 category3) {
		this.category3 = category3;
	}
	
	public Category3 getCategory3() {
		return category3;
	}
}
