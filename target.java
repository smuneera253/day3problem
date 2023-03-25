//class target
//{
  //public static void main(String[]args)
 //{
	//int [] arr= {1,2,3,4,5,6,};
	
	//int target=5;
	
	//for(int i=0;i<arr.length;i++)
	//{
		//for(int j=i+1;j<arr.length;j++)
	
	//{
		//if(arr[i]+arr[j]==target)
		//{
		  	//System.out.println("true");
		//}
		//else
		//{
			//System.out.println("false");
   		//}
	//}
	//}
// }
//}

class HelloWorld {
    public static void main(String[] args)
    {
         int[] arr= {1,2,3,4,5,6,};
         
	     int target=9;
	     
	     System.out.println(equalTheTargetvalve(target,arr));
    }
    public static boolean equalTheTargetvalve(int target,int[] arr)
    {
        boolean flag = false;
	    for(int i = 0 ; i < arr.length - 1; i++)
	    {
	    	for(int j = i + 1; j < arr.length; j++)
	
	        {
		        if(arr [i] + arr [j] == target)
		        {
		  	       flag = true;
		  	       break;
		  	        
	    	    }
	        }
        }   
        return flag;
    }
}
