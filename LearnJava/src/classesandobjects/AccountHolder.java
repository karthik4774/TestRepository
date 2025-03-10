package classesandobjects;

public class AccountHolder {
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
