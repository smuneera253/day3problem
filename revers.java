class HelloWorld {
    
    public static String str="never";
    //convert str into arr;
    public static char[] arr = str.toCharArray();
    public static void main(String[] args)
    {
        System.out.println(arr);
        ReverseSubString(0 , arr.length-1 , arr);//reverse the the string
        System.out.println(arr);// print the revers string
    }
    public static void ReverseSubString(int start , int end ,char[] arr)
    {
        while (start <= end)
        {
            char num = arr [start];
            arr [start] = arr [end];
            arr [end] = num;
            start ++;
            end --;
        }
    }
    
}


