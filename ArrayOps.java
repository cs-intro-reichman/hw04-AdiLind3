public class ArrayOps {
    public static void main(String[] args) {
        int[] intargs = convertStringToIntArray(args);
        int x = secondMaxValue(intargs);
        System.out.println("the secmax " + x);
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int length = array.length;
        
        int testnum = 0;
        for(int i=0; i<length;i++)
        {
            Boolean flag = false;
            testnum = i;
            for(int j = 0; j< array.length ; j++)
            {
                if(array[j] == testnum)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
            {
                break;
            }
        }
        return testnum;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = Math.max(array[0], array[1]); // get the max value for the 2 first objects
        int secmax = Math.min(array[0], array[1]); // get the min value
        for ( int i=2; i< array.length ; i++)
        {
            if(array[i] >= max)
            {
                secmax = max;
                max = array[i];
            }
            else if ( (array[i] > secmax) && (array[i] <= max))
            {
                secmax = array[i];
            }
            
        }
        return secmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int length1 = array1.length;
        int length2 = array2.length;
        boolean flag = false;
        //int maxlength = Math.max(length1, length2);
        if (length1 >= length2)
        {
            for(int k =0; k < length1; k++)
            {
                int temp = array1[k];
                if(contains(array2, temp))
                {
                    flag = true;
                }
            }
        }
        else
        {
            for(int t =0; t < length1; t++)
            {
                int temp = array1[t];
                if(contains(array2, temp))
                {
                    flag = true;
                }
            }
        }

        return flag;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

    public static int[] convertStringToIntArray (String[] stringArray)
    {
        int length = stringArray.length;
        int[] intArray = new int[length];

        for ( int i = 0; i < length; i++)
        {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    public static boolean contains(int[] array, int x)
    {
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] == x)
            {
                return true;
            }
        }
        return false;
    }
}
