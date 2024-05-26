import java.io.*;
import  java.util.*;

public class User 
{
	public static void main(String[]args)
	{   
		int i = 0;
		System.out.println ("Please enter your last name:"); 
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		BufferedReader br = Address.read();
		ArrayList <String[]> arrays = Address.search(br , text);

		for (String[] line1 : arrays)
		{
			Address wheretolive = new Address(line1[0],line1[1],line1[2],line1[3],line1[4],line1[5],line1[6]);
			System.out.println(wheretolive.toString());
		}

		if (arrays.size() == 0)
		{
			System.out.println("No Match !");
		}

	}

}

class Address
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;

	Address(String firstName, String lastName, String address, String city, String state, String zip, String phone)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}

	static BufferedReader read()
	{
		String filename = "addrbook.txt";
        	try 
		{
            		FileReader fr = new FileReader(filename);
            		BufferedReader br = new BufferedReader(fr);
            		return br;
        	} 
		catch (Exception e)
		{
            	System.out.println(e);
            	return null; 
        	}
   	}

	static ArrayList<String[]> search(BufferedReader br , String text)
	{
		ArrayList<String[]> list1 = new ArrayList<>();
		String line;
		try 
		{
			while ( (line = br.readLine( )) != null ) 		
			{
        			String[] line1 = line.split(",");
				if (line1[0].toLowerCase().contains(text.toLowerCase()))
				{	
					list1.add(line1);
				}	
        		}
			return list1;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return null;
		}
	} 

	@Override
	public String toString()
	{
        	String a = "\n" + "First name: " + firstName + "\nLast name: " + lastName + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip:" + zip + "\nPhone number : " + phone + "\n";
    		return a;
	}
}