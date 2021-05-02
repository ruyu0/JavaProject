package pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Product2 {
	private String name;
	private int Id;
//	@Autowired
	private Category2 category2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category2 getCategory2() {
		return category2;
	}

//	@Autowired
	@Resource(name = "c2")
	public void setCategory2(Category2 category2) {
		this.category2 = category2;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

}