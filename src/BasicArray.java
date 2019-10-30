public class BasicArray
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    public static void main(String[] args)
    {
        int[] list = new int[LIMIT];
        //Intialize the array values
        for(int index = 0; index < LIMIT; index++)
        {
            list[index] = index *MULTIPLE;
        }//end for
        list [5] = 999;
        for(int index = 0; index < LIMIT; index++)
        {
            System.out.print(list[index]+" ");
        }//end for
        System.out.println();
    }//end main method
}//end BasicArray class
//Shannon Cascaddan