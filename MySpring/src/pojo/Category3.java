package pojo;

import org.springframework.stereotype.Component;

@Component("category3")
public class Category3 {
	private String name = "Category3 1";
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
