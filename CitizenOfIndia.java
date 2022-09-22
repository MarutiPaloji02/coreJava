class CitizenOfIndia{
	public static void showTheResponsibility(int age, char gender){
		System.out.println("Invoke of Responsibility");
		int age = 13;
		char gender = 'F';
		if(age >= 10 && age < 16){        //AnD operator  //OR operator
			System.out.println("Responsibility is School");
		}
		if(age >= 21)
		{
			System.out.println("Responsibility is Voting");
		}
		if(gender == 'F')
		{
			System.out.println("Girls can leggally Marry");
		}
		else 
		{
			System.out.println("Boys can not leggally Marry");
		}
		System.out.println("End of Responsibility");
	}
}