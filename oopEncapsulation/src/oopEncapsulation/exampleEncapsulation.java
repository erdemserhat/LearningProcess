package oopEncapsulation;

 class exampleEncapsulation {

	 private String name; // private = restricted access
	 //Getter - Using Get
	 
	 
	 
	 //defined a function named get+(Variable)
	 public String getName() {
	// the private variable's name should be written to start upper case.	 
		 return name;
	 }
	  // Setter Using Setter
	 // defined a function named set+(Variable)
	public void  setName(String newName) {
		
		this.name=newName;
	}
	
	public static void main ( String [] args) {
		
		System.out.println("test for main method");
		exampleEncapsulation exampleObject = new exampleEncapsulation();
		exampleObject.setName("serhat");
		System.out.println(exampleObject.getName());
		
	}
	
	
// so get and set method should be defined in the class which consist private variable 
	// thus, by using get and set method we can access them read only (get) and write only (write)

	} 
	
/*Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data*/


 