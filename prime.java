class HelloWorld {
    public static void main(String[] args) {
        cheakPrime(5);
    }
    public static void cheakPrime(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2) {
    	    System.out.println("prime ");
        }
        else {
        	System.out.println("not prime");
        }
    }   
}
