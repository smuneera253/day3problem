
class HelloWorld {
    public static void main(String[] args) 
    {
       //declaring the arr
    
       int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,3,4}};
      
       //declare the values
       int row = 4; 
       int col = 4;
       
       System.out.println(matrixproduct(row,col,arr));//print sum of matrix row,and col
    }
    
    public static int matrixproduct(int row,int col, int [][]arr)
    {
        int product = 1;
        
        for(int i = 0 ; i < row ; i++) 
        {
    	     for(int j = 0; j < col ; j++)
    	     {
    	            if(i==0 || j==0 || i==row-1 || j==col-1)
    	             {
    	             	//to add the rows and col
    	             	product *= arr[i][j];
    	             }
    	             
    	     }
        }
        return product;
    }
}

