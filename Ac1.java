class  Ac1{
	
	static String brand;
	static String colour;
	static String price;
	static boolean isConnected;
	static int maxVolume=8;
	static int minVolume;
	static int currentVolume;
	public static boolean onOrOff()
	{
		System.out.println("inside onOrOff() method");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Ac is turned onnn... ");
		}
		else if(isConnected == true)
			{
			isConnected = false;
		System.out.println("Ac is turned off..");
		}
		
		System.out.println("end of onOrOff()");
		return isConnected;
	}
	public static void increaseVolume()
	{
		 System.out.println("inside increaseVolume()");
		
		//false == true
		if(isConnected == true)
		{
			
		if(currentVolume < maxVolume)
		{	
			currentVolume = currentVolume + 1 ;
			System.out.println("The Current Volume is :" + currentVolume);
	    }
	else {
		System.out.println("Max Volume reached...");
		
	}
	}
	}
		public static void decreaseVolume()
	{
		System.out.println("-----------------------------------------");
		 System.out.println("inside decreaseVolume()");
		//false == true
		if(isConnected == true)
		{	
			if(currentVolume > minVolume)
			{	
				currentVolume = currentVolume - 1 ;
				System.out.println("The Current Volume is :" + currentVolume);
			}
			
			else {
				System.out.println("min Volume reached...");	
			}
		}
		else {
				System.out.println("end od min Volume reached...");	
			}
	}
}
		 
		
		


