/* write a function to move
all O's to end of it while maintaining the relative order of
the non-zero elements.*/


    public class moveAllZero {

        public void moveZero(int[]array)
        {
            int j=0;
            for(int i=0;i<array.length;i++)
            {
                if(array[i]!=0 && array[j]==0)
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                if(array[j]!=0)
                j++;
            }
        }
        public void printArray(int[]array)
        {
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]);
            }
        }
        public static void main(String[]args)
        {
            int [] myArray={1,0,2,3,0,4};
            moveAllZero obj=new moveAllZero();
            obj.moveZero(myArray);
            obj.printArray(myArray);
        }

        
    }
