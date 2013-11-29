package hit.jt.reflection;

/**
 * A base class having some attributes and methods
 * @author Octobershiner
 * @since 2012 3 17
 * 
 * */

public class Role {
	
	private String name;
	private String type;
	
	// Constructors
	public Role(){
		System.out.println("Constructor Role() is invoking");
	}
	
	private Role(String name){
		this.name = name;
		System.out.println("Constructor Role(String name) is invoking.");
	}
	
	//get and set method
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//override the toString method to show the class
	@Override
	public String toString(){
		return "This is a role called "+this.name;
	}
	
}
