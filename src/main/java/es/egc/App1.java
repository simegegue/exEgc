package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION
 *
 */
public class App1 
{
	static Logger log=Logger.getLogger(App1.class); 
	
	public static int divide(int a, int b){
		int result= a/b;
		System.out.println("Returning"+a+"*"+b+"="+result);
		return result;
	}
	
	
}
