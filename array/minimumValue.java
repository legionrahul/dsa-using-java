public class minimumValue {
    public int findMinimun(int[]array)
    {
       int minimun=array[0];
       for(int i=0;i<array.length;i++)
       {
        if(array[i]<minimun)
        minimun=array[i];
       } 
       return minimun;

    }
    public static void main(String[]args)
    { 
        minimumValue obj=new minimumValue();
        int[] myArray={1,2,0,6,8};
       obj. findMinimun(myArray);
    }
    
}
