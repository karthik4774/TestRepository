package practicemethodoverloading;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 add(5,6);
float result2 = add(5.5f,6.6f);
System.out.println("The  float result is "+result2);
	}
 static void add(int x,int y)
{
	int result = x+y;
	System.out.println(result);
}
static float add(float x, float y)
{
	float result = x+y;
	return result;
}
}
