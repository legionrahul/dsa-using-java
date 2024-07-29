public class missingNumber {
    public int missing(int[] array)
    {
        int n=array.length+1;
        int sum=n*(n+1)/2;
        for(int i=0;i<array.length ;i++)
        {
            sum=sum-array[i];

        }
        return sum;
    }
    public static void main(String[]args)
    {    int[] myArray ={1,2,3,4,6,7};
        missingNumber obj=new missingNumber();
        int result=obj.missing(myArray);
        System.out.println(result);
    }
    
}
