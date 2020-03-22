package Jenkins_Tester.JTesting;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;




public class Jen {
	
	
	public static Logger ls=LogManager.getLogger(Jen.class.getName());

	@Test
	public static void Tes() {
		System.out.println("**************************Testing to Check Maven and Jenkins Integration*************************************");
	    System.out.println("Raghu");
		ls.info("Test Verified");
	
	}


}
