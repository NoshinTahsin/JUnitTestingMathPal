package mathpal;

import java.util.Scanner;

public class VolumeCalculation {
	
	Cylinder gscy= new Cylinder();
	Sphere gss=new Sphere();
	Cube gsc=new Cube();
	
	VolumeCalculation(){
		
	}
	
	double cylinder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cylinder ::");
		gscy.setRadius(sc.nextDouble());
		gscy.setHeight(sc.nextDouble());
		 
		if(gscy.getHeight()<1 || gscy.getRadius()<1)
	    	return -1;
		
		double volume=(gscy.getRadius()*gscy.getRadius()*gscy.getHeight()*3.14);
		System.out.println(volume);
	    return Math. round(volume * 100.0) / 100.0;
	}
	
	double cone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cone ::");
		gscy.setRadius(sc.nextDouble());
		gscy.setHeight(sc.nextDouble());
		 
		if(gscy.getHeight()<1 || gscy.getRadius()<1)
	    	return -1;
		
		double volume=(gscy.getRadius()*gscy.getRadius()*gscy.getHeight()*3.14)/3;
		System.out.println(volume);
	    return volume;
	}
	
	double cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the cube ::");
		gsc.setSide(sc.nextDouble());
		 
		if(gsc.getSide()<1)
			return -1;
		
		double volume=(gsc.getSide()*gsc.getSide()*gsc.getSide());
		System.out.println(volume);
	    return volume;
	}
	
 
	double sphere()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Sphere ::");
		gss.setRadius(sc.nextDouble());
		 
		if(gss.getRadius()<1)
	    	return -1;
		double volume=(4*gss.getRadius()*gss.getRadius()*gss.getRadius()*3.14)/3;
		System.out.println(volume);
	    return volume;
		
	}
	
	
	void chooseCalc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to calculate volume of \n 1. Sphere 2. Cylinder"
				+ " 3. Cube 4. Cone");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			double volume=sphere();
			if(volume==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The volume of the Sphere :: "+ volume);
		}
		
		else if(choice ==2)
		{
			double volume=cylinder();
			if(volume==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The volume of the cylinder :: "+ volume);
		}
		
		else if(choice ==3) {
			double volume=cube();
			if(volume==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The volume of the cube :: "+ volume);
		}
		
		else if(choice ==4) {
			double volume=cone();
			if(volume==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The volume of the cone :: "+ volume);
		}
		
	}
}
