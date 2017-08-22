package WeatherProject;
import java.util.Scanner;

public class WeatherProject
{
                                                                  //Blayne Boles
	public static void main(String[] args) 
	{
		
	System.out.print("Enter Degrees Fahrenheit");
		
		Scanner cin = new Scanner(System.in);
		
		
		
		int temperature = cin.nextInt();
		temperature = ((temperature - 32) * 5/9);
		
	System.out.println(temperature);
		
		cin.close();
		

		if(temperature>31)
		{
			System.out.println("its hot");
		}
		
	
		
		else if (temperature<0)
		{
			System.out.println("its cold");
		}
		
	}

}