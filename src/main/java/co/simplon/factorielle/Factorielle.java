package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    private static Logger logger = LoggerFactory.getLogger(Factorielle.class);
    
    public long calculer(long n) {
    	
    	logger.debug ("----- Début calculer n= {}", n);
    	if (n > 1) {
    		logger.info("If n > 1");
        	return n * calculer(n-1);
    	} else if (n == 0) {
    		logger.info("If n = 0");
        	return 1;
    	} else if (n < 0) {
    		logger.error("If n < 0 --> Exception");
        	throw new IllegalArgumentException();
    	}
    	logger.info("-- Après If : return {}", n);
    	return n;
    }

}
