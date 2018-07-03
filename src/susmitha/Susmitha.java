package susmitha;

public class Susmitha {

	public static void main(String[] args)
	{
		int i=0;
		int n=0;
		String primenumbers=" ";
		
		 for(i = 1; i <= 20; i++)
		 {
			int counter=0;
			for(n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2) 
			{
				primenumbers= primenumbers + i+" " ;
			}
		 }
		 System.out.print(primenumbers);

	}

}
