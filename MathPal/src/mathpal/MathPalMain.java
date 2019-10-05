//volume 3 area 2 more methods
package mathpal;
import java.util.Scanner;
public class MathPalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want to Perform \n 1. Area Calculation 2. Volume Calculation/n"
				+ " 3.Surface Area Calculation\n 4. Mathematical Operations"
				+ " 5. Cryptography 6. Calendar/n 7. Currency Converter/n");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		
		{
			AreaCalculation areacalc= new AreaCalculation();
			areacalc.chooseCalc();
		}
		
		else if(choice ==2)
		{
			VolumeCalculation volCalc= new VolumeCalculation();
			volCalc.chooseCalc();
		}
		
		else if(choice ==3) {
			SurfaceArea surface= new SurfaceArea();
			surface.chooseCalc();
		}
		
		else if(choice ==4) {
			MathematicalOperation mahthop= new MathematicalOperation();
			mahthop.chooseCalc();
		}
		
		else if(choice ==5) {
			Cryptography numberGame= new Cryptography();
			numberGame.crypt();
		}
 
		else if(choice ==6) {
			Calendar cal= new Calendar();
			cal.chooseCalc();
		}
		
		else if(choice ==7) {
			CurrencyConverter cc= new CurrencyConverter();
			cc.chooseCalc();
		}
 
	}

}
	
}
