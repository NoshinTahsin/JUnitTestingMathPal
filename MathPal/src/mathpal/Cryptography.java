package mathpal;

import java.util.Scanner;

public class Cryptography {
	
	CryptoGS crp=new CryptoGS();
	
	Cryptography(){
		
	}
	
	// Encrypts text using a shift od s 
    public String encrypt(String text, int s) 
    { 
        String result= "";
        String shiftAlert= "Couldn't Encrypt. Shift must be between -2147483648"
        		+ " to 2147483647"; 
        
  
        if(s>2147483647 || s<-2147483648)
        	return shiftAlert;
        
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result+=ch; 
            } 
            else if(Character.isLowerCase(text.charAt(i)))
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result+=ch;  
            } 
            
            else 
            	result+="(Input Invalid for "+i+" no. index)";
        } 
        return result; 
    } 
  
    // Driver code 
    public void crypt()
    { 
    	System.out.println("Enter the text and shift: ");
    	Scanner sc = new Scanner(System.in);
    	 
        crp.setOrigin(sc.nextLine());
        crp.setShift(sc.nextInt());
        System.out.println("Text  : " + crp.getOrigin()); 
        System.out.println("Shift : " + crp.getShift()); 
        System.out.println(encrypt(crp.getOrigin(), crp.getShift())); 
    } 
	
	
}
