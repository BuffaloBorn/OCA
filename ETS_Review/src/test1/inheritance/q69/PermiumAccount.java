package test1.inheritance.q69;

interface Account{ 
	public default String getId(){return "0000";} 
} 


interface PremiumAccount extends Account{	
	
	//static String getId(){ return "1111"; } // will not compile - cannot hide the 
											  // instance method from parent Account 
	//String getId(); 						  // An interface can redeclare a default 
											  // method and also make it abstract.
	default String getId(){return "1111"; };  // An interface can redeclare a default method and 
											  // provide a different implementation.
	//abstract static String getName(); 	  // will not compile - illegal combination of
											  // modifiers: abstract, static or default 
	//static String getName();				  // will not compile - requires a body
	//default String getName();			      // will not compile - requires a body 
}


