package bankingapp.driver;



import org.apache.logging.log4j.core.config.Configurator;

import bank.Prompts;




public class Driver {
	
    public static void main(String args[]) {

    	Configurator.initialize(null, "log4j.xml");
    	Prompts.initialPrompt();
    	
    	
    	
   }
}