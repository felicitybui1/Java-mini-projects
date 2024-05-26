public class Studentmain					        //the user class
{
      public static void main (String[ ] args)
      {
	Student.setClassNumber("111");
        Student.setClassName("Java Programming");
        Student.setInstructor("Sam Sultan");

	Student s1 = new Student("Phuong","Bui");
	Student s2 = new Student("Joe","Ali");
	Student s3 = new Student("Sam", "Sultan","116th Street", "New York City", "NY", "sam@cu.edu");
	Student s4 = new Student("Robert", "Brown", "789 Awesome St", "Chicago", "IL", "robert@cu.edu");
	Student s5 = new Student("Michael", "Jackson", "456 Columbia Ave", "Los Angeles", "CA", "michael@cu.edu");

	System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
	
	s1.setFirstname("Felicity");
        s2.setLastname("Alibaba");
	s3.setAddress("607 113th Street");
	s4.setInstructor("Samuel Sultan");
        s5.setEmail("michaeljackson@cu.edu");
	
	System.out.println("\nAfter updating student information using setters:");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());

      }
}

class Student						        //the service class (not public)
{
	private static String classNumber;
	private static String className;
	private static String instructor;

	private int studentId;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String email;
	
	private static int lastStudentId = 999;
	
	// static method (getter)
	static String getClassNumber(){
		return(classNumber);
	}
	static String getClassName(){
		return(className);
	}
	static String getInstructor(){
		return(instructor);
	}
	
	// static method (setter)
	static void setClassNumber(String number) {		
	classNumber = number;
	}
	static void setClassName(String name) {		
	className = name;
	}
	static void setInstructor(String instructorname) {		
	instructor = instructorname;
	}

	// instance method (getter)
	int getStudentId( ) {					
	return (studentId);
	}
		String getFirstname( ) {					
	return (firstname);
	}
		String getLastname( ) {					
	return (lastname);
	}
		String getAddress( ) {					
	return (address);
	}
		String getCity( ) {					
	return (city);
	}
		String getState( ) {					
	return (state);
	}
		String getEmail( ) {					
	return (email);
	}

	// instance method (setter)
	
	void  setStudentId(int id) {				
	studentId = id;
	}
	void  setFirstname(String first) {				
	firstname = first;
	}
	void  setLastname(String last) {				
	lastname = last;
	}
	void  setAddress(String address) {				
	address = address;
	}
	void  setCity(String city) {				
	city = city;
	}
	void  setState(String state) {				
	state = state;
	}
	void  setEmail(String email) {				
	email = email;
	}

	Student(String first, String last)
	{
		firstname = first;
		lastname = last;
		this.studentId = ++lastStudentId;
	}
	
	Student(String first, String last, String address, String city, String state, String email)
	{
		this(first,last);
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email; 
	}
	
	public String toString ( ) {						    // instance method (must be public)
	String data  = "    Class Number: " + classNumber +		            // belongs to each object
			"\t Class Name: "  + className + 			    
			"\t Instructor Name: " + instructor +
			"\t Student ID: " + studentId +
			"\t Student Name: "     + firstname +  " " + lastname + 
			"\t Address: "        + address + 
			"\t City: "       + city +
			"\t State: " + state +
			"\t Email: " + email ;
	return (data);
	}

}
