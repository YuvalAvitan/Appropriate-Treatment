import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Doctor {
	private static FileWriter writer = null;
	
	private static ArrayList<Patient> pat = new ArrayList<Patient>();
	
	
	public Doctor()
	{
		try {
			writer= new FileWriter("D:\\softwareDev\\pat.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean Check_Username(String userName)
	{
		int DigitCounter = 0;
		int Counter = 0;
		
		if(userName.length() >= 6 && userName.length() <=8)
		{
			for(int i=0; i<userName.length(); i++)
			{
				char c = userName.charAt(i);
				if(c >= '0' && c<= '9')
					DigitCounter++;
				else if( (c >= 'a' && c <='z') || (c>= 'A' && c<='Z'))
					Counter++;
			}
			
			if(DigitCounter <= 2 && Counter == (userName.length() - DigitCounter))
				return true;
		}
		return false;
	}
	
	public static boolean Check_Password(String Password)
	{
		int DigitCounter = 0;
		int CharCounter = 0;
		int SpecielCounter = 0;
		
		if(Password.length() >= 8 && Password.length() <=10)
		{
			for(int i=0; i<Password.length(); i++)
			{
				char c = Password.charAt(i);
				
				if(c >= '0' && c<= '9')
					DigitCounter++;
				else if( (c >= 'a' && c <='z') || (c>= 'A' && c<='Z'))
					CharCounter++;
				else
					SpecielCounter++;
			}
			
			if(DigitCounter > 0 && CharCounter >0 && SpecielCounter >0)
				return true;
		}
		return false;
	}

	public static  ArrayList<Patient> getPat() {
		return pat;
	}

	public static FileWriter getWriter() {
		return writer;
	}

	public static void setWriter(FileWriter writer) {
		Doctor.writer = writer;
	}	
}
