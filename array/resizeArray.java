public class resizeArray {
    public int[] resize(int[] array)
    {
        int capicity=array.length;
        int []temp=new int[2*capicity];
        for(int i=0;i<capicity;i++)
        {
            temp[i]=array[i];

        }
        return temp;
    }
    public static void main(String[]args)
    {
        resizeArray obj=new resizeArray();
        int[] myArray={1,2,3,4};
      int [] resizedArray=  obj.resize(myArray);
      for(int i=0;i<resizedArray.length;i++)
      {
        System.out.println(resizedArray[i]);
      }
    }
    
}
