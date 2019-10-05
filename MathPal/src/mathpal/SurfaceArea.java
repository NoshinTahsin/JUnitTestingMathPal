package mathpal;

import java.util.Scanner;
import java.lang.Math; 

public class SurfaceArea {

	Cylinder gscy= new Cylinder();
	Sphere gss=new Sphere();
	Cube gsc=new Cube();
	
	SurfaceArea(){
		
	}
	
	double cylinder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cylinder ::");
		gscy.setRadius(sc.nextDouble());
		gscy.setHeight(sc.nextDouble());
		
		if(gscy.getHeight()<1 ||gscy.getRadius()<1)
			return -1;
		
		double surfaceArea=(2*3.14*gscy.getRadius()*gscy.getHeight())+
				(2*3.14*gscy.getRadius()*gscy.getRadius()); 
		System.out.println(surfaceArea);
	    return surfaceArea;
	}
	 
	double cone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cone ::");
		gscy.setRadius(sc.nextDouble());
		gscy.setHeight(sc.nextDouble());
		
		if(gscy.getHeight()<1 ||gscy.getRadius()<1)
			return -1;
		
		double h2=gscy.getHeight()*gscy.getHeight();
		double r2=gscy.getRadius()*gscy.getRadius();
		
		double p1=gscy.getRadius()+Math.sqrt(h2+r2);
		
		double surfaceArea=3.14*gscy.getRadius()*p1;
		System.out.println(surfaceArea);
	    return surfaceArea;
	}
	
	double cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the cube ::");
		gsc.setSide(sc.nextDouble());
		 
		if(gsc.getSide()<1)
			return -1;
		
		double surfaceArea=6*gsc.getSide()*gsc.getSide();
		System.out.println(surfaceArea);
	    return surfaceArea;
	}
	
 
	double sphere()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Sphere ::");
		gss.setRadius(sc.nextDouble());
		 
		if(gss.getRadius()<1)
			return -1;
		
		double volume=4*3.14*gss.getRadius()*gss.getRadius();
		System.out.println(volume);
	    return volume;
		
	}
	
	
	void chooseCalc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to calculate Surface Area of \n 1. Sphere 2. Cylinder"
				+ " 3. Cube 4. Cone");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			double surfaceArea=sphere();
			if(surfaceArea==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The surfaceArea of the Sphere :: "+ surfaceArea);
		}
		
		else if(choice ==2)
		{
			double surfaceArea=cylinder();
			if(surfaceArea==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The surfaceArea of the cylinder :: "+ surfaceArea);
		}
		
		else if(choice ==3) {
			double surfaceArea=cube();
			if(surfaceArea==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The surfaceArea of the cube :: "+ surfaceArea);
		}
		
		else if(choice ==4) {
			double surfaceArea=cone();
			if(surfaceArea==-1)
				 System.out.println("Invalid Input");
			else
				System.out.println("The surfaceArea of the cone :: "+ surfaceArea);
		}
		
	}
}
