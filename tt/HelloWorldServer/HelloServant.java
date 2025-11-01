package HelloWorldServer;
import org.omg.CORBA.ORB;
import HelloWorldApp.HelloPOA;

public public class HelloServant extends HelloPOA{
	private String msg = "Bonjour tous le monde ";
	private ORB orb;
	
	public void setOrb(ORB orb) {this.orb = orb;
	
	}

	public String HelloMessage() {
		
	}
	public vid HelloMessage(String newHelloMessage) { 
		message = newHelloMessage;
	}
}