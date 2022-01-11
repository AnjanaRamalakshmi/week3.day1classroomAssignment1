package week3.day1.classromAssignment1;

public class AndroidPhone extends SmartPhone
{
	
	  public void takeVideo()
	  {
		  System.out.println("takeVideo method");
	  }
	 
	public static void main(String[] args) 
	{
		AndroidPhone androidPhone = new AndroidPhone();
		
		androidPhone.sendMsg();
		androidPhone.makeCall();
		androidPhone.saveContact();
		
		androidPhone.accessWhatsapp();
		androidPhone.takeVideo();
		
	}
}
