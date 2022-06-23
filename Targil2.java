import java.util.Scanner;
public class Targil2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int choice;
		boolean fcontinue=true;
		do
		{
			System.out.println("Choose one of the following options:");
			System.out.println("5- Question number 5. The programm gets a number and returns a new number so that each pair of digits that nearby will be replaced");
			System.out.println("8- Question number 8. The programm gets 2 numbers with the same number of digits and returns a new number, that takes the digit from the first number and prints it number of times that equals to the digit in the same place in the other number");
			System.out.println("9- Question number 9. The programm gets a number and a digit, divide the number to parts equal to the digit and returns a new number with the reversed parts");
			System.out.println("11- Question number 11. The programm gets a number and drawing isosceles triangle with up base");
			System.out.println("12- Question number 12. The programm gets an odd number and creats a hourglass using asterisks");
			System.out.println("13- Question number 13. The programm gets a number and prints carpet of squares using asterisks");
			System.out.println("14- Question number 14. The programm gets an odd number and prints a tree using asterisks");
			System.out.println("15- Question number 15. The programm prints Happy Numbers from 10 until ther will be 3 following numbers");
			System.out.println("0- Exit");
			
			System.out.print("Enter your choice-->");
			choice=s.nextInt();
			
			switch(choice)
			{
				/////// Question 5 ///////////
				case 5:
				{
					int num, temp=1,rightDigit,newNum=0,i=0;
					System.out.println("Please enter a number");
					num=s.nextInt();
					while (num!=0) 
					{
					   rightDigit=num%10;
					   rightDigit=rightDigit*temp;

					   if((num>9) && (i%2==0))
					        rightDigit=rightDigit*10;
					   else
					   {
						   if (i%2!=0)
							   rightDigit=rightDigit/10;
					   }
					   
					   newNum=newNum+rightDigit;
					   temp=temp*10;
					   num=num/10;
					   i++;
					}
					System.out.println("Your new number is " +newNum);
					break;
				}
			
				/////// Question 8 ///////////
				case 8:
				{
					int temp=1,num1,num2,count=0,digit,answer=0;
					System.out.println("Please enter the first number");
					num1=s.nextInt();
					System.out.println("Please enter the second number with the same number of digits");
					num2=s.nextInt();
				
					while(num1!=0)
					{
						digit=num1%10;
						num1=num1/10;	
								
						for (int i=1; i<=digit && count<9;i=i+1)
						{
							answer=answer+(num2%10*temp);
							count=count+1;
							temp=temp*10;
						}
						num2=num2/10;
					}
					System.out.print(answer);
					break;
				}
					
				/////// Question 9 ///////////
				case 9:
				{
					int num,size=1,temp,digit,newNum=0,location=1;
					System.out.println("Please enter your number");
					num=s.nextInt();
					System.out.println("Please enter your digit");
					digit=s.nextInt();
					while(digit>9)
					{
						System.out.println("Invalid digit. Please enter your digit");
						digit=s.nextInt();
					}
					for (int i=0;i<digit;i++)
						size=size*10;
							
					while(num!=0)
					{
						temp=num%size;
						int part=0;
						while(temp!=0)
						{
							part=part*10;
							part=part+(temp%10);
							temp=temp/10;
						}
						newNum=newNum+part*location;
						location=location*size;
						
						num=num/size;
					}
					System.out.print("Rev num is " +newNum);
					break;
				}
			
				/////// Question 11 ///////////
				case 11:
				{
					int num;
					System.out.println("Please enter a number");
					num=s.nextInt();
					for (int i=num;i>=1;i=i-1)
					{
						for (int k=0;k<num-i;k=k+1)
							System.out.print(" ");
						
						for (int j=1;j<=i;j=j+1)
							System.out.print("* ");
						  
						System.out.println();
					}	
					break;
				}
				
				/////// Question 12 ///////////
				case 12:
				{
					int num;
					System.out.println("Please enter an odd number");
					num=s.nextInt();
					
					for (int i=num;i>=1;i=i-1)
					{
						for (int k=0;k<num-i;k=k+1)
							System.out.print(" ");
								
						for (int j=1;j<=i;j=j+1)
							System.out.print("* ");
						
						System.out.println();
					}
					
					for (int i=1;i<=num;i=i+1)
					{
						for (int k=0;k<num-i;k=k+1)
							System.out.print(" ");
						
						for (int j=1;j<=i;j=j+1)
							System.out.print("* ");
						
						System.out.println();
					}
					break;
				}
					
				/////// Question 13 ///////////
				case 13:
				{
					int num;
					System.out.println("Please enter a number");
					num=s.nextInt();
					
					for (int i=1;i<=(num*num)+num;i=i+1)
					{
						if (i%(num+1)!=0)
						{
							for (int j=1;j<=(num*num)+num;j=j+1)
							{
								if (j%(num+1)!=0)
									System.out.print("*");
								else
									System.out.print(" ");
							}
						}
						else
							System.out.print(" ");
						
						System.out.println();
					}
					break;
				}
				
				/////// Question 14 ///////////
				case 14:
				{
					final int triangles=3;
					int num;
					System.out.println("Please enter an odd number");
					num=s.nextInt();
					while(num%2==0)
					{
						System.out.println("Invalid number. Please enter an odd number");
						num=s.nextInt();
					}
					
					for (int m=1;m<=triangles;m=m+1)
					{
						for (int i=1;i<=num;i=i+1)
						{
							for (int k=1;k<=num-i;k=k+1)
								System.out.print(" ");
						
							for (int j=1;j<=i;j=j+1)
								System.out.print("* ");
						  
							System.out.println();
						}	
					}
					
					for (int i=1;i<=num;i=i+1)
					{
						for (int j=1;j<=num;j=j+1)
						{
							if (num==j)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						System.out.println();
					}
					break;
				}
				
				/////// Question 15 ///////////
				case 15:
				{
					int i=10,counter=0,numberLine=1;		
					int num=i;		
					while(counter<=2)
					{
						int sum=0;
						while (num>0)
						{	
							sum=sum+((num%10)*(num%10));
							num=num/10;
						}
						
						while(sum>=10)
						{
							num=sum;
							sum=0;
							while (num>0)
							{
								sum=sum+((num%10)*(num%10));
								num=num/10;
							}
						}
							if (sum==1)
							{
								System.out.println(numberLine+") "+i+ " is a happy number :-)");
								numberLine++;
								counter++;
							}
							else
								counter=0;
							
							i++;
							num=i;
					}
					System.out.print((num-3)+" "+ (num-2)+ " "+ (num-1));
					break;
				}
				case 0:
					fcontinue=false;
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
			System.out.println();
		}
		while(fcontinue);
		System.out.println("Thank you and Goodbye!");
	}
}	