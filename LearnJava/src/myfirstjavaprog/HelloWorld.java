package myfirstjavaprog;


public class HelloWorld {
	
	public int staticVariable = 10;
	//staticVariable = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Karthik..");
HelloWorld obj1 = new HelloWorld();
int y= obj1.function();
System.out.println(y);


	}
	 public int function()
	{
		 int x = (staticVariable )+1;
		 function1();
         return x;
	}
	 public static int function1()
	 {
		 return 1;
	 }

}
