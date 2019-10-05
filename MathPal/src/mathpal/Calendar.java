package mathpal;

import java.util.Scanner;

public class Calendar {

	AgeDayMonthYear gsa= new AgeDayMonthYear();
	
/*	static int dayofweek(int d, int m, int y) 
	{ 
	    
		if(d<1 || d>31 || m<1 || m>12 || y<0 ||y>1728366700)
	    	return -1;
		  
	    if(d==31 && (m==2||m==4||m==6||m==9||m==11))
	    	return -1;
	     
	    if(m==2 && d==29)
	    {
	    	if(checkYear(y)=="Not Leap Year")
	    	{
	    		System.out.println(y);
	    		return -1;
	    	}
	    }
	    
	    if((d==30||d==31) && m==2)
	    	return -1;
	    
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	     
	    //System.out.println(( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7);
	    
	    return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	} */
	  
	// Driver Program to test above function 
	public String day() 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day, month, year::");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		int dayReturn;
		
		if(d<1 || d>31 || m<1 || m>12 || y<0 ||y>1728366700)
	    	dayReturn= -1;
		  
	    if(d==31 && (m==2||m==4||m==6||m==9||m==11))
	    	dayReturn= -1;
	     
	    if(m==2 && d==29)
	    {
	    	if(checkYear(y)=="Not Leap Year")
	    	{
	    		System.out.println(y);
	    		dayReturn= -1;
	    	}
	    }
	    
	    if((d==30||d==31) && m==2)
	    	dayReturn= -1;
	    
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	     
	    //System.out.println(( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7);
	    
	    dayReturn= ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	    
		 
		
	    String dayArray[]= {"Sunday", "Monday", "Tuesday", 
	    		"Wednesday", "Thursday", "Friday","Saturday"};
	    String i="Invalid date";
	    
	    if(dayReturn==-1)
	    	return i;
	    
	    System.out.println(dayReturn);
	    
	    return dayArray[dayReturn]; 
	} 
	
	
   /* static String findAge(int current_date, int current_month, 
    		int current_year, int birth_date, 
            int birth_month, int birth_year) 
    { 
    	int month[] = { 31, 28, 31, 30, 31, 30, 31,  
                     31, 30, 31, 30, 31 }; 

    	// if birth date is greater then current  
    	// birth_month, then donot count this month 
    	// and add 30 to the date so as to subtract  
    	// the date and get the remaining days 
    	if (birth_date > current_date) { 
    		current_month = current_month - 1; 
    		current_date = current_date + month[birth_month - 1]; 
    	} 

    	// if birth month exceeds current month,  
    	// then do not count this year and add  
    	// 12 to the month so that we can subtract 
    	// and find out the difference 
    	if (birth_month > current_month) { 
    		current_year = current_year - 1; 
    		current_month = current_month + 12; 
    	} 

    	// calculate date, month, year 
    	int calculated_date = current_date - birth_date; 
    	int calculated_month = current_month - birth_month; 
    	int calculated_year = current_year - birth_year; 

    	// print the present age 
    	return "Present Age"+"Years: " + calculated_year +  
    			" Months: " + calculated_month + " Days: " +  
    			calculated_date; 
    	} 

    public void age() 
    { 
    	Scanner sc = new Scanner(System.in);
    	// present date 
    	System.out.println("Enter current_date, current_month and current_year : ");
    	gsa.setCurrentDate(sc.nextInt()); 
    	gsa.setCurrentMonth(sc.nextInt()); 
    	gsa.setCurrentYear(sc.nextInt()); 

    	System.out.println("Enter birth_date, birth_month and birth_year : ");
    	// birth dd// mm// yyyy 
    	gsa.setBirthDate(sc.nextInt()); 
    	gsa.setBirthMonth(sc.nextInt()); 
    	gsa.setBirthYear(sc.nextInt()); 

    	// function call to print age 
    	String age=findAge(gsa.getCurrentDate(), gsa.getCurrentMonth(), gsa.getCurrentYear(), 
    			gsa.getBirthDate(), gsa.getBirthMonth(), gsa.getBirthYear()); 
    	System.out.print(age);
    } */
    
    public static String checkYear(int year) 
    { 
        if(year<0 || year>1728366700)
        	return "Invalid Year";
        
    	// If a year is multiple of 400,  
        // then it is a leap year 
        if (year % 400 == 0) 
            return "Leap Year"; 
      
        // Else If a year is muliplt of 100, 
        // then it is not a leap year 
        if (year % 100 == 0) 
            return "Not Leap Year"; 
      
        // Else If a year is muliplt of 4, 
        // then it is a leap year 
        if (year % 4 == 0) 
            return "Leap Year"; 
        return "Not Leap Year"; 
    } 
          
    // Driver method 
    public void leapYear()
    { 
    	System.out.println("Enter the year: ");
    	Scanner sc = new Scanner(System.in);
    	int year=sc.nextInt() ; 
        System.out.println(checkYear(year));
    } 
	
	void chooseCalc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to \n 1.Day of the year\n"
				+ " 2. Leap year\n");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println(day());
		}
		
		else if(choice ==2)
		{
			leapYear();
		}
		
	}
}