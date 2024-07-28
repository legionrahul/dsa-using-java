        public class removeEvenInt {
            /* 
            public void removeEven(int []arr)
            { 
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]%2 !=0 )
                    {
                    System.out.println(arr[i]);
                    }
                }

            }*/

            public int[] removeEven(int[]arr)
            {
                int oddCount=0;
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]%2!=0)
                    oddCount++;
                }
                int []result=new int[oddCount];
                int indx=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]%2!=0)
                    {
                        result[indx]=arr[j];
                        indx++;

                    }
                }
                return result;

            }
            public static void main(String[]args)
            {
                removeEvenInt obj=new removeEvenInt();
                int [] myArray={1,2,4,5,7};
           int[] newArry= obj.removeEven(myArray);
           for(int i=0;i<newArry.length;i++)
           {
            System.out.print (newArry[i]);
           }
            
            }
        
            
        }
      