 import java.io.*;
class BRReadLines
{
	public static void main(String args[]) throws IOException 
		{ 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
String str;

System.out.println("Enter 'stop' to quit.");
	int empid;
	String name;
	double salary;
	System.out.println("Enter empid");
	empid=Integer.parseInt(br.readLine());
	System.out.println("Enter name");
	name=br.readLine();
	System.out.println("Enter salary");
	salary= Double.parseDouble(br.readLine());
	System.out.println(" empid= "+ empid);
	System.out.println(" name= "+ name);
	System.out.println(" salary= "+ salary);
			}}
