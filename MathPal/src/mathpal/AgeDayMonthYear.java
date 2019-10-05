package mathpal;

public class AgeDayMonthYear {

	private int currentDate;
	private int currenMonth;
	private int currentYear;
	
	private int birthDate;
	private int birthMonth;
	private int birthYear;
	
	public void setCurrentDate(int currentDate)
	{
		this.currentDate=currentDate;
	}
	
	public int getCurrentDate() {
		return currentDate;
	}
	
	public void setCurrentMonth(int currenMonth)
	{
		this.currenMonth=currenMonth;
	}
	
	public int getCurrentMonth() {
		return currenMonth;
	}
	
	public void setCurrentYear(int currentYear)
	{
		this.currentYear=currentYear;
	}
	
	public int getCurrentYear() {
		return currentYear;
	}
	
	
	
	
	public void setBirthDate(int birthDate)
	{
		this.birthDate=birthDate;
	}
	
	public int getBirthDate() {
		return birthDate;
	}
	
	public void setBirthMonth(int birthMonth)
	{
		this.birthMonth=birthMonth;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public void setBirthYear(int birthYear)
	{
		this.birthYear=birthYear;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
}
