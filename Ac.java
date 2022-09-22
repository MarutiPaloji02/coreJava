class Ac{
	
	static String brand;
	static String colour;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println("inside onOrOff");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Ac is turned onnn... ");
		}
		 if(isConnected == true) {
			isConnected = false;
		System.out.println("Ac is turned off..");
		}
		
		System.out.println("end of onOrOff");
		return isConnected;
	}
	
	
}