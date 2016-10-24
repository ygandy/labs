package co.grandcircus.studentlist;
//Pranavi reddy Madadi // Yolanda Gandy
public class Movie {

	private String name;
	private String category;
	
	
	 public Movie(String name, String category) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.category= category;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getCategory(){
		return category;
	}
	
	public void setCategory(String Category){
		this.category = category;
	}
	
	
}