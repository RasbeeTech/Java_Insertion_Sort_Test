    /*
     * Java Program to Implement Insertion Sort
     */
    import java.util.Scanner;    

    /* Class InsertionSort */
    public class InsertionSort 
    {
        /* Insertion Sort function */
        public static void sort( int arr[] )
        {
            int N = arr.length;
            int i, j, temp;
            for (i = 1; i< N; i++) 
            {
                j = i;
                temp = arr[i];    
                while (j > 0 && temp < arr[j-1])
                {
                    arr[j] = arr[j-1];
                    j = j-1;
                }
                arr[j] = temp;            
            }        
        }    
        /* Main method */
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner( System.in );        
            System.out.println("Insertion Sort Test\n");

            int n, i;

            /* Get the number of elements */
            System.out.println("Enter quantity of integer elements:");
            n = scan.nextInt();

            /* Create integer array on n elements */
            int arr[] = new int[ n ];

            /* Accept elements */
            System.out.println("\nEnter "+ n +" integer elements:");
            for (i = 0; i < n; i++)
                arr[i] = scan.nextInt();

            /* Call method sort */
            sort(arr);

            /* Print sorted Array */
            System.out.println("\nElements after sorting ");        
            for (i = 0; i < n; i++)
                System.out.print(arr[i]+" ");            
            System.out.println();                     

        }    

    }
	