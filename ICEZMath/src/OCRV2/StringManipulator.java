package OCRV2;

import java.io
import java.util.Arrays;

public class StringManipulator
{
	String equation;
	static int operand;
	
	public StringManipulator(String result)
	{
		equation = result;
		
		
		System.out.println(result);
	}

	
	public int FindOperand(String equation)
	{
		if (equation.contains("+"))
			
			operand = 1;
		
		else if (equation.contains("-"))
			
			operand = 2;
		
		else if (equation.contains("*")||equation.contains("X")||equation.contains("x"))
			
			operand = 3;
		
		else if (equation.contains("/"))
			
			operand = 4;
		
		return operand;
		
	}
	
	public Arrays GenerateEquation(int operand)
	{
		switch (operand)
		{
		case 1:
			for(int i = 0; i < 4; i++)
			{
				String example = 
			}
			break;
		case 2:
			for(int i = 0; i < 4; i++)
			{
				String example = 
			}
			break;
		case 3:
			for(int i = 0; i < 4; i++)
			{
				String example = 
			}
			break;
		case 4:
			for(int i = 0; i < 4; i++)
			{
				String example = 
			}
			break;
		default:
			System.out.println("Operation not found please retry.");
			break;
			
		}
		return null;
	}
	

}
