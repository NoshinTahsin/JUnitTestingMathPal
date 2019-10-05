package mathpal;

import java.util.Scanner;

public class AreaCalculation {
	
	Triangle gst= new Triangle();
	Rectangle gsr=new Rectangle();
	Circle gsc=new Circle();
	Square gss=new Square();
	
	AreaCalculation(){
		 
	}
	
	double triangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle ::");
	    gst.setHeight(sc.nextDouble());
	    System.out.println("Enter the base of the triangle ::");
	    gst.setBase(sc.nextDouble());
		
	    if(gst.getHeight()<1 || gst.getBase()<1)
	    	return -1;
		double area=(gst.getHeight()*gst.getBase())*0.5;
	    return area;
	}
	
	double rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the Rectangle ::");
		gsr.setHeight(sc.nextDouble());
	    System.out.println("Enter the width of the Rectangle ::");
	    gsr.setWidth(sc.nextDouble());
		
	    if(gsr.getHeight()<1 || gsr.getWidth()<1)
	    	return -1;
		double area=(gsr.getHeight()*gsr.getWidth());
	    return area;
	}
	
	double circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle ::");
		gsc.setRadius(sc.nextDouble());	
		if(gsc.getRadius()<1)
	    	return -1;
		double area=(gsc.getRadius()*gsc.getRadius())*3.14;
	    return area;
	}
	
	double square()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square ::");
		gss.setSide(sc.nextDouble());
		
		if(gss.getSide()<1)
	    	return -1;
		
		double area=(gss.getSide()*gss.getSide());
	    return area;
	}
	
	void chooseCalc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to calculate area of \n 1. Triangle 2. Rectangle"
				+ " 3. Square 4. Circle");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			  
			 double area=triangle();
			 
			 if(area==-1)
				 System.out.println("Invalid Input");
			 else
				 System.out.println("The area of the triangle :: "+ area);
		}
		
		else if(choice ==2)
		{
			 
			double area=rectangle();
			 
			if(area==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The area of the Rectangle :: "+ area);
		}
		
		else if(choice ==3) {
			  
			double area=square();
			 
			if(area==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The area of the Square :: "+ area);
		}
		
		else if(choice ==4) {
		 
			double area=circle();
			 
			if(area==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The area of the Circle :: "+ area);
		}
		
	}
}
