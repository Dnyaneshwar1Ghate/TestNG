package TestNG;

import org.testng.annotations.Test;

public class Operation {
	
	@Test
	public void Add()
	{
		int a=10;
		int b=50;
		System.out.println(a+b);
	}
	@Test
	public void Sub()
	{
		int a=10;
		int b=50;
		System.out.println(a-b);

	}
	@Test
	public void Mul()
	{
		int a=10;
		int b=50;
		System.out.println(a*b);

	}
	@Test
	public void Div()
	{
		int a=10;
		int b=50;
		System.out.println(a/b);

	}
	

}
