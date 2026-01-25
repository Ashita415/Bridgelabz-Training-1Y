import java.util.*;
class SpringSeason{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int mon=sc.nextInt();
		int day=sc.nextInt();
		if(mon==3)
		{
			if(day>=20 && day<=31)
			{
				System.out.println("Its a Spring Season");
			}
			else
			{
				System.out.println("Not a Spring Season");
			}
		}
		else if(mon==4)
		{
			if(day>=20 && day<=30)
			{
				System.out.println("Spring Season");
			}
			else
			{
				System.out.println("Not Spring Season");
			}
		}
		else if(mon==5)
		{
			if(day>=20 && day<=31)
		    {
				System.out.println("Spring Season");
			}
			else
			{
				System.out.println("Not Spring Season");
		    }
		}
		else if(mon==6)
		{
			if(day>=20 && day<=30)
			{
				System.out.println("Spring Season");
			}
			else
			{
				System.out.println("Not Spring Season");
			}
		}
		
	}
}