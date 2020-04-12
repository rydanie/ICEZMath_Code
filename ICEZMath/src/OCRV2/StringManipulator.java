package OCRV2;

import java.util.*;
//import java.io
import java.util.Arrays;

public class StringManipulator
{
	String equation;
	int operand;
	ArrayList eList;
	ArrayList savedList;
	
	public StringManipulator(String result)
	{
		equation = result;
		eList = new ArrayList<Equation>();
		
		
		System.out.println(result);
		
		FindOperand(equation);
		GenerateEquation(operand);
		
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
	
	public void GenerateEquation(int op)
	{
		Random r = new Random();
		
		switch (op)
		{
		case 1:
			for(int i = 0; i < 4; i++)
			{
				int x = r.nextInt(11);
				int y = r.nextInt(11);
				String example =  x + " + " + y;
				
				System.out.println(example);
				
				Equation a = new Equation(x,y,operand,example);
				eList.add(a);
			}
			break;
		case 2:
			for(int i = 0; i < 4; i++)
			{
				int x = r.nextInt(11);
				int y = r.nextInt(11);
				String example =  x + " - " + y;
				
				System.out.println(example);
				
				Equation a = new Equation(x,y,operand,example);
				eList.add(a);
			}
			break;
		case 3:
			for(int i = 0; i < 4; i++)
			{
				int x = r.nextInt(11);
				int y = r.nextInt(11);
				String example =  x + " * " + y;
				
				System.out.println(example);
				
				Equation a = new Equation(x,y,operand,example);
				eList.add(a);
			}
			break;
		case 4:
			for(int i = 0; i < 4; i++)
			{
				int x = r.nextInt(11);
				int y = r.nextInt(11);
				String example =  x + " - " + y;
				
				System.out.println(example);
				
				Equation a = new Equation(x,y,operand,example);
				eList.add(a);
			}
			break;
		default:
			System.out.println("Operation not found please retry.");
			break;
			
		}
		
		saveEquationList(eList);
		
	}
	
	public void saveEquationList(ArrayList a)
	{
		savedList = a;
	}
	
	public ArrayList<Equation> getEquationList()
	{
		return savedList;
	}
	
	public void clearList()
	{
		eList.clear();
	}
	

}
