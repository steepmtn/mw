package util;

public class Product {
	private int id;
	private String name;
	
  
	@Override
	public String toString(){
		return String.valueOf(this.hashCode());
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
