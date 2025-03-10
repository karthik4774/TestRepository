package classesandobjects;

public class AccountHolder {//this class is the blueprint
String Name;
	 int Age ;
	float Salary;
	boolean eligibleForCreditCard = false ;
	public  void isEligibleForCreditCard()
	{
	if(Age>=25 && Salary>30000)
	{
		 eligibleForCreditCard = true;
		 
	}
}
}
