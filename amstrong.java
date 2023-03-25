class AmstrongNumber
 {
    public static void main(String[] args)
    {
    	int number = 120;
    	
    	String number1 = Integer.toString(number);
    	
    		int length = number1.length();
    		
   		 amstrongNumber(number,length);
    }
     public static void amstrongNumber(int number,int length)
     {
    	int sum = 0;
    	while(number > 0)
    {
    	int rem = number%10;
    	
    	sum += Math.pow(rem,length);
    	
    	number /= 10;
    }
   	 if(number == sum)
   	 {
    		System.out.println("Amstrong Number");
    	 }
    	 else
    	 {
    		System.out.println("Not Amstrong Number");
    	 }
    }
  }
