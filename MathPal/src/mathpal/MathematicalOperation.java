package mathpal;
import java.util.Scanner;
import java.util.Stack; 
public class MathematicalOperation {

	MathematicalOperation(){
		
	}
        
    static String isPalindrome(String str) 
    { 
  
        String yes="Palindrome";
        String no="Not a Palindrome";
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return no; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return yes; 
    } 
  
    // Driver code 
    public String palindrome()
    { 
    	System.out.println("Enter the string to check palindrome: ");
    	Scanner sc = new Scanner(System.in);
    	String str=sc.nextLine();
  
    	return isPalindrome(str);
            
    } 
    
    static int calculateFactorial(int n) 
    { 
    	if(n<0)
    		return -1;
    	
    	if (n == 0) 
          return 1; 
          
        return n*calculateFactorial(n-1); 
    } 
      
    // Driver method 
    public String factorial()  
    { 
    	System.out.println("Enter the number to calculate factorial: ");
    	Scanner sc = new Scanner(System.in);
    	int num=sc.nextInt() ; 
    	
    	if(calculateFactorial(num)==-1)
    		return "Invalid Input";
    	
        return "Factorial of "+ num + " is " + calculateFactorial(num); 
    } 
    

    static int calcnPr(int n, int r) 
    { 
        if(n<1 || r<1 || n<r)
        	return -1;
        return calculateFactorial(n) / calculateFactorial(n - r); 
    } 
    
    static int calcnCr(int n, int r) 
    { 
    	if(n<1 || r<1 || n<r)
        	return -1;
    	return calculateFactorial(n) / (calculateFactorial(r)*calculateFactorial(n - r)); 
    } 
  
    public String nPr()
    { 
    	System.out.println("Enter the n and r: ");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int r = sc.nextInt();
  
        if(calcnPr(n, r)==-1)
        	return "Invalid Input";
        
        return n + "P" + r + " = "
                           + calcnPr(n, r); 
    } 
    
    public String nCr()
    { 
    	System.out.println("Enter the n and r: ");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int r = sc.nextInt();
  
        if(calcnCr(n, r)==-1)
        	return "Invalid Input";
        
       return n + "C" + r + " = "
                           + calcnCr(n, r); 
    } 
    
    
    void chooseCalc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to \n 1. Factorial\n"
				+ " 2. Palindrome\n 3. nCr\n 4. nPr \n");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println(factorial());
		}
		
		else if(choice ==2)
		{
			System.out.println(palindrome());
		
		}
		
		else if(choice ==3) {
			System.out.println(nCr());
		}
		
		else if(choice ==4) {
			System.out.println(nPr());
		}
		
		 
	 
	 
	}
	  
	    
	}

