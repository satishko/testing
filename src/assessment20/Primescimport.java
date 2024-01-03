package assessment20;

public class Primescimport 
{
	public static void main(String[] args)
	{
		for (int num=1;num<=100;num++)
		{
			int count = 0;
			for (int i=1;i<=num;i++)
			{
				if (num%i==0)
				{
					count++;
				}
			}
			if (count==2)
				System.out.println(num+"is a prime number");
			if (count!=2)
				System.out.println(num+"is not a prime number");
				
			
		}

	}
}
	



