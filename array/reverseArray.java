    /*Q. Given an array or string, the task is to reverse
    array or string.
    Example -
    Given array of integers - {2, 11, 5, 10, 7, 8}
    Solution -
    return reverse of array - {8, 7, 10, 5, 11, 2}*/


    public class reverseArray {
        public void reverseMyarray(int[] arry)
        {
            int start=0;
            int end=arry.length-1;
            while(start<end){
           
            
                int temp=arry[start];
                arry[start]=arry[end];
                arry[end]=temp;
                start++;
                end--;

            
        }
            

            }

            public void printArray(int[]arry)
            {
            for(int i=0;i<arry.length;i++)
            {
                System.out.println(arry[i]);
            }
            }

            public static void main(String[]args)
            {
                reverseArray obj=new reverseArray();
                int[] myArray={2, 11, 5, 10, 7, 8};
                
                 obj.printArray(myArray);  

                obj.reverseMyarray(myArray);

                System.out.println("  ");

                obj.printArray(myArray); 
            } 
            
        }
