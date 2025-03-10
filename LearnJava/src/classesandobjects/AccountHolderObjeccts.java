package classesandobjects;

public class AccountHolderObjeccts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccountHolder karthik = new AccountHolder();
AccountHolder madhu = new AccountHolder();

karthik.Name = "Karthik B";
karthik.Age = 29;
karthik.Salary = 20000;
karthik.isEligibleForCreditCard();

madhu.Name = "Madhu Mathi";
madhu.Age = 25;
madhu.Salary = 40000;

madhu.isEligibleForCreditCard();

System.out.println("Is karthik Eligible for Credit Card: "+karthik.eligibleForCreditCard);
System.out.println("Is Madhu Eligible for Credit Card: "+madhu.eligibleForCreditCard);
	}

}
