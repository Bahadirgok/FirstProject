package Day43;

public class Product {

	  private String name; 
	  private float rating; 
	  private double price; 
	  private String productId;
	  
//	  create method to see the value of all fields
	  
	  public void initilizeAllFieldValues() {
		  this.name = name;
		  this.rating = rating;
		  this.price = price;
//		  this.productId = p
//		  Obtionally
//		  you can do above
		  setProductId(productId);
	  }
	  
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public float getRating() {
	    return rating;
	  }
	  public void setRating(float rating) {
	    this.rating = rating;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  public String getProductId() {
	    return productId;
	  }
	  public void setProductId(String productId) {
	    this.productId = productId;
	  } 
}
