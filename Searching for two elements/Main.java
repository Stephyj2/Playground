import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int element_1_index = 1;
        int element_2_index = -1;
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
        	arr[i]= in.nextInt();
        }
       int search_elem_1 = in.nextInt();
       int search_elem_2 = in.nextInt();
       for(int i=0;i<num;i++)
        {
        	if(arr[i]== search_elem_1)
            {
               element_1_index = i;
            }
           else if(arr[i]== search_elem_2)
            {
               element_2_index = i;
            }
        }
       System.out.println(element_1_index);
        System.out.println(element_2_index);
    }
}