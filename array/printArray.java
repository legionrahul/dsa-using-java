public class printArray
{
    public void printElement(int[] arr)
    {
          int arrayLength=arr.length;
          for(int i=0;i<arrayLength;i++)
          {
            System.out.println(arr[i]);
          }
    }

    public static void main(String[]args)
    {
        printArray arrObj=new printArray();
        int[] myArray=new int[5];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
      arrObj. printElement(myArray);
    }
}