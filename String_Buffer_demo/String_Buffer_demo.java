package String_Buffer_demo;

import java.util.Scanner;

public class String_Buffer_demo 
{

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String name;
		System.out.println("Enter your name=");
		name=obj.next();
		StringBuffer sb=new StringBuffer(name);
		sb.append(" is my name.");
		System.out.println(sb);
		System.out.println("Before capacity= "+sb.capacity());
		sb.insert(1,"a");//insert method in string 
		System.out.println(sb);//prints  
		sb.replace(1, 5,"s");//replace method in string 
		System.out.println(sb);//prints  
		sb.delete(1, 3);//delete method in string 
		System.out.println(sb);//prints
		sb.reverse();
		System.out.println(sb);
		System.out.println("after capacity= "+sb.capacity());//capacity method in string 
		
		

	}

}
