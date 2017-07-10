import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {

	// Find your Account Sid and Token at twilio.com/user/account
	  public static final String ACCOUNT_SID = "ACa759da61f0dbe97f81ba13a910fbe6aa";
	  public static final String AUTH_TOKEN = "5745c1a3ed8408c7429fbfcdc2fb77d2";
	
	  public static void main(String[] args) {
		    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		    Message message = Message.creator(new PhoneNumber("+529982246830"),
		        new PhoneNumber("+17867385135"), 
		        "This is the ship that made the Kessel Run in fourteen parsecs?").create();
		    
		    

		    System.out.println(message.getSid());
		  }
	  
}
