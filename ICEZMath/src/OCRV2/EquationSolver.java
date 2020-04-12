package OCRV2;

public class EquationSolver {

	int ch;
	Equation eq;
	int x;
	int y; 
	
	public EquationSolver() 
	{
		
	}
	
	public EquationSolver(Equation e) 
	{
		eq = e;
		ch = eq.getOperand();
		x = eq.getx();
		y = eq.gety();
		
		
		//do
		//{
			//system("cls");
			//System.out.println( "Enter your math problem (Addition (1), Subtraction (2), Multiplication (3), Division (4), End Program (5): ";
			//cin >> ch;
			if (ch == 1) //Addition
			{
				add();
			}
			else if (ch == 2) //Subtraction
			{
				subtract();
			}
			else if (ch == 3) //Multiplication
			{
				multiply();
			}
			else if (ch == 4) //Division
			{
				divide();
			}
			else if (ch < 1 || ch > 5)
				System.out.println( "Please Enter a math problem" + "n");
			//cin.get();
			//cin.get();
		//} while (ch != 5);
		
	//End Program
	System.out.println( "\n\nEnter to END ");
		
	}
	


	public void add()
	{
	
		//system("cls");
		//srand(time(NULL)); 
		int A = 0;
		int v = 0;
		int o = 0;
		
		
		//x = (rand() % 20) + 1;
		//y = (rand() % 20) + 1;
		
		
		System.out.println( "You have the problem: " + x + " + " + y + "n" + "n");
	
		System.out.println( "Pretend every number is made up of tally marks, every mark equals 1." + "n" + "n");
	
		System.out.println( "I = One." + "n");
		System.out.println( "II = Two." + "n");
		System.out.println( "IIIII = Five." + "n");
		System.out.println( "IIIII IIIII = Ten." + "n" + "n");
	
		System.out.println( "So, " + x + " will be written as ");
		while (v < x)
		{
			System.out.println( "I");
			v++;
			
			if(v % 5 == 0)
			{
				System.out.println( " ");
			}
		}
		
		System.out.println( " and " + y + " will be written as ");
		while (o < y)
		{
			System.out.println( "I");
			o++;
	
			if (o % 5 == 0)
			{
				System.out.println( " ");
			}
		} System.out.println( "n" + "n");
		
	
		A = x + y;
		System.out.println( "Add these tallies up, and the number you find will be " + A + ", the same number you get when you add " + x + " and " + y + " together." + "n" + "n");
	
		System.out.println( "So that means: " + x + " + " + y + " = " + A);
	}
	
	void subtract()
	{
	
		//system("cls");
		//srand(time(NULL));
		int A = 0;
		int v = 0;
		int o = 0;
	
	
		//x = (rand() % 20) + 1;
		//y = (rand() % 20) + 1;
	
		if (x > y) {
			System.out.println( "You have the problem: " + x + " - " + y + "n" + "n");
	
			System.out.println( "Pretend every number is made up of tally marks, every mark equals 1." + "n" + "n");
	
			System.out.println( "I = One." + "n");
			System.out.println( "II = Two." + "n");
			System.out.println( "IIIII = Five." + "n");
			System.out.println( "IIIII IIIII = Ten." + "n" + "n");
	
			System.out.println( "So, " + x + " will be written as ");
			while (v < x)
			{
				System.out.println( "I");
				v++;
	
				if (v % 5 == 0)
				{
					System.out.println( " ");
				}
			}
	
			System.out.println( " and " + y + " will be written as ");
			while (o < y)
			{
				System.out.println( "I");
				o++;
	
				if (o % 5 == 0)
				{
					System.out.println( " ");
				}
			} System.out.println( "n" + "n");
	
			A = x - y;
			System.out.println( "Take away one tally from the larger set of tally marks for every tally there is from the smaller set of tally marks, and the number you find will be " + A + ", the same number you get when you subract " + y + " from " + x + "." + "n" + "n");
	
			System.out.println( "So that means: " + x + " - " + y + " = " + A);
		}
		else {
			System.out.println( "You have the problem: " + y + " - " + x + "n" + "n");
	
			System.out.println( "Pretend every number is made up of tally marks, every mark equals 1." + "n" + "n");
	
			System.out.println( "I = One." + "n");
			System.out.println( "II = Two." + "n");
			System.out.println( "IIIII = Five." + "n");
			System.out.println( "IIIII IIIII = Ten." + "n" + "n");
	
			System.out.println( "So, " + y + " will be written as ");
			while (v < y)
			{
				System.out.println( "I");
				v++;
	
				if (v % 5 == 0)
				{
					System.out.println( " ");
				}
			}
	
			System.out.println( " and " + x + " will be written as ");
			while (o < x)
			{
				System.out.println( "I");
				o++;
	
				if (o % 5 == 0)
				{
					System.out.println( " ");
				}
			} System.out.println( "n" + "n");
	
			A = y - x;
			System.out.println( "Take away one tally from the larger set of tally marks for every tally there is from the smaller set of tally marks, and the number you find will be " + A + ", the same number you get when you subract " + x + " from " + y + "." + "n" + "n");
	
			System.out.println( "So that means: " + y + " - " + x + " = " + A);
		}
	}

	void multiply()
	{
		//system("cls");
		//srand(time(NULL));
	

		int A = 0;
		int v = 0;
		int q = 0;
	
	
	
		//x = (rand() % 13);
		//y = (rand() % 13);
		A = x * y;
		System.out.println( "You have the problem: " + x + " x " + y + "n" + "n");
		
		if (x == 1) 
		{
			System.out.println( "When a number is being multiplied by 1, when using the methood provided," + "n");
			System.out.println( "the answer equals the number that isn't 1." + "n" + "n");
	
			System.out.println( "Any number multiplied by 1 equals itself." + "n" + "n");
	
			System.out.println( x + " x " + y + " = " + A);
		}
		
		else if (y == 1) 
		{
			System.out.println( "When a number is being multiplied by 1, when using the methood provided," + "n");
			System.out.println( "the answer equals the number that isn't 1." + "n" + "n");
	
			System.out.println( "Any number multiplied by 1 equals itself." + "n" + "n");
	
			System.out.println( x + " x " + y + " = " + A);
		}
		
		if (x == 0 || y == 0) 
		{
			System.out.println( "When a number is being multiplied by 0, it automatically equals 0." + "n" + "n");
			
			System.out.println( x + " x " + y + " = " + A);
		}
	
		else 
		{
			System.out.println( "With basic multiplication, you're adding the first number to itself as meny times as how large the second number is" + "n" + "n");
	
			System.out.println( "So, you would add " + x + " to itself " + y + " time(s)." + "n" + "n");
	
			System.out.println( "This would be written out as: " + x);
			while (v < y - 1)
			{
				System.out.println( " + " + x);
				v++;
			} System.out.println( "n" + "n");
	
			System.out.println( "Adding up the equation above, it will equal the answer to " + x + " x " + y + "n" + "n");
	
			System.out.println( x);
			while (q < y - 1)
			{
				System.out.println( " + " + x);
				q++;
			} System.out.println( " = " + A + "n");
			System.out.println( x + " x " + y + " = " + A);
		}
		
	}
	
	void divide()
	{
		
		//system("cls"); 
		//srand(time(NULL));
	
		int v = 0;
		int w = 0;
		//x = (rand() % 13);
		//y = (rand() % 13);
		
		if (x * y != 0) 
		{
	
	
			if (x >= y)
			{
				System.out.println( "You have the problem: " + x + " / " + y + "n" + "n");
	
				System.out.println( "How many times can " + y + " go into " + x + "?" + "n");
				System.out.println( "Add " + y + " to itself repeatedly until it is equal to or less than " + x + "n");
				System.out.println( "without going over." + "n" + "n");
	
				int r = x;
				int o = 0;
				while (r >= y)
				{
					System.out.println( y);
	
					v++;
	
					r -= y;
	
					if (r >= y)
					{
						System.out.println( " + ");
					}
				} o = v * y;
				System.out.println( " = " + o + "n");
				System.out.println( "n" + y + " can go into " + x + " " + v + " time(s) without going over." + "n" + "n");
				if (r != 0)
				{
					System.out.println( "Since " + o + " is still smaller than " + x + ", this tells us" + "n");
					System.out.println( "there is a remainder." + "n" + "n");
	
					System.out.println( "To find the remainder, we simply subtract " + o + " from " + x + "n" + "n");
	
					System.out.println( x + " - " + o + " = " + r + "n" + "n");
	
					System.out.println( "Our answer to " + x + " / " + y + " is " + v + " with a remainder of " + r + "n");
					System.out.println( x + " / " + y + " = " + v + ", R = " + r);
				}
				else 
				{ 
					System.out.println( "Since " + o + " is equal to " + y + ", this tells us" + "n");
					System.out.println( "there are no remainders." + "n" + "n");
	
					System.out.println( "Our answer to " + x + " / " + y + " is " + v + "." + "n");
					System.out.println( x + " / " + y + " = " + v);
				}
			} 
			
			else 
			{
				System.out.println( "You have the problem: " + y + " / " + x + "n" + "n");
	
				System.out.println( "How many times can " + x + " go into " + y + "?" + "n");
				System.out.println( "Add " + x + " to itself repeatedly until it is equal to or less than " + y + "n");
				System.out.println( "without going over." + "n" + "n");
	
				int r = y;
				int o = 0;
				while (r >= x)
				{
					System.out.println( x);
	
					v++;
	
					r -= x;
	
					if (r >= x)
					{
						System.out.println( " + ");
					}
				} o = v * x;
				System.out.println( " = " + o + "n");
				System.out.println( "n" + x + " can go into " + y + " " + v + " time(s) without going over." + "n" + "n");
				if (r != 0)
				{
					System.out.println( "Since " + o + " is still smaller than " + y + ", this tells us" + "n");
					System.out.println( "there is a remainder." + "n" + "n");
	
					System.out.println( "To find the remainder, we simply subtract " + o + " from " + y + "n" + "n");
					System.out.println( y + " - " + o + " = " + r + "n" + "n");
	
					System.out.println( "Our answer to " + y + " / " + x + " is " + v + " with a remainder of " + r + "n");
					System.out.println( y + " / " + x + " = " + v + ", R = " + r);
				}
				else
				{
					System.out.println( "Since " + o + " is equal to " + x + ", this tells us" + "n");
					System.out.println( "there are no remainders." + "n" + "n");
	
					System.out.println( "Our answer to " + y + " / " + x + " is " + v + "." + "n");
					System.out.println( y + " / " + x + " = " + v);
				}
			}
		}
	
		else
		{
			if (y == 0)
			{
				System.out.println( "You have the problem: " + x + " / " + y + "n" + "n");
	
				System.out.println( "This problem is unabled to be solved, as anything divided by 0 is undefined, or not abled to be solved.");
			}
			else
			{
				System.out.println( "You have the problem: " + x + " / " + y + "n" + "n");
	
				System.out.println( "When 0 is being divided by another number, the answer will always be 0, except for one instance." + "n");
				System.out.println( x + " / " + y + " = 0" + "n" + "n");
	
				System.out.println( "The only instance the answer will not be 0, is when 0 is being divided by 0, then there" + "n");
				System.out.println( "will be no answer, as anything divided by 0 is undefined, or not abled to be solved.");
			}
		}
	}
}