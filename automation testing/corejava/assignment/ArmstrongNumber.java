package assignment;

public class ArmstrongNumber 
{
     public static void main(String[] args) 
     {
		int no=9;
		
		if(isArmstrong(no))
		{
			System.out.println(no + "is an Armstrong number.");
		}
		else
		{
			System.out.println(no + "is not an Armstrong number.");
		}
	}
        public static boolean isArmstrong(int num)
        {
        	int originalNum=num;
        	int sum=0;
        	int numberofDigits= String.valueOf(num).length();
        	
        	while(num>0) 
        	{
        		int digit=num% 10;
        		sum+= Math.pow(digit, numberofDigits);
        		num/=10;
        	}
        	 return sum== originalNum;
        }
  }
