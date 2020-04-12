package OCRV2;

public class Equation {
	
	int x;
	int y;
	int operand;
	String equation;
	
	public Equation(int a, int b, int op, String s)
	{
		x = a;
		y = b;
		operand = op;
		equation = s;
		
	}
	
	public void setx(int i)
	{
		
	}
	
	public int getx()
	{
		return x;
	}
	
	public void sety(int i)
	{
		x = i;
	}
	
	public int gety()
	{
		return y;
	}
	
	public void setOpperand(int i)
	{
		y = i;
	}
	
	public int getOperand()
	{
		return operand;
	}
	
	public void setEquation(String s)
	{
		equation = s;
	}
	
	public String getEquation()
	{
		return equation;
	}

}
