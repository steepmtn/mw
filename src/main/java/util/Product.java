package util;

public class Product {
  
	@Override
	public String toString(){
		return String.valueOf(this.hashCode());
	}
}
