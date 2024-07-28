 class secondMaximum {

    public int secondMax(int[] array)
    {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if( array[i]>max)
            {
            secondmax=max;
            max=array[i];
            }
        
        else if(array[i]>secondmax && array[i]!=max)
        {
            secondmax=array[i];
        }
    }
    return secondmax;

    }

    public static void main(String[]args)
    {
        secondMaximum obj=new secondMaximum();
        int[] myArray={1,5,3,5,4};
      int value=  obj.secondMax(myArray);
      System.out.println(value);
    }

    
}
