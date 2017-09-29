package co.simplon.factorielle;

import org.apache.log4j.Logger;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    private static Logger logger = Logger.getLogger(Factorielle.class);
    
    public long calculer(long n) {
    	System.out.println("Début calculer n=" + n);
    	if (n > 1) {
        	System.out.println("If n > 1");
        	return n * calculer(n-1);
    	} else if (n == 0) {
        	System.out.println("If n = 0");
        	return 1;
    	} else if (n < 0) {
        	System.out.println("If n < 0 --> Exception");
        	throw new IllegalArgumentException();
    	}
    	System.out.println("Après If : return " + n);
    	return n;
    }

}
