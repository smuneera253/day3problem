class circle
 {
    public static void main(String[] args) 
    {
    	//we are taking the redius value
        double redius = 5;
        
        double area = areaOfCircle(redius); //declare the function name

        System.out.println(area); //print the area of circle
       
    }
    
    public static double areaOfCircle(double redius)
    {
        //implement the redius formula
        return(22 * redius * redius) / 7;
    }
}
