package practicerecursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion ren = new Recursion();
int result = ren.sum(5);
System.out.println("The Sum all the numbers upto number 10 is "+result);
	}
 int sum(int x)
{
	if(x>0)
	{
		return x + sum(x-1);
	}
	else
	{
		return 0;
	}
}
}
