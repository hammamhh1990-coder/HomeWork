//3168158
//همام سالم بن غزي
package ex1;
import java.util.Arrays;
import java.util.Random;
public class Ex1 
{
    public static void selection_sort(int a[],int n)
    {
        int i,j,smallast;
        int temp;
        
        if(n<2)
            return ;
        
        for(i=0;i<n-1;++i)
        {
            smallast = i;
            for(j=i+1;j<n;++j)
            {
                if(a[smallast]>a[j])
                {
                    smallast=j;
                }
            }
            
            temp = a[i];
            a[i]= a[smallast];
            a[smallast]=temp;
        }
    }
    
    public static void selection_sort_Reversed(int a[],int n)
    {
        int i,j,smallast;
        int temp;
        
        if(n<2)
            return ;
        
        for(i=0;i<n-1;++i)
        {
            smallast = i;
            for(j=i+1;j<n;++j)
            {
                if(a[smallast]<a[j])
                {
                    smallast=j;
                }
            }
            
            temp = a[i];
            a[i]= a[smallast];
            a[smallast]=temp;
        }
    }
    
    public static void Insertion_sort(int s[],int n)
    {
        int j;
        int temp;
        
        if(n<2) return;
        
        for(int i=1;i<n;++i)
        {
            temp = s[i];
            for(j=i;j>0 && s[j-1]>temp;--j)
            {
                s[j]=s[j-1];
            }
            s[j]=temp;
        }
    }
    
    public static void Bubble_Sort(int A[], int n)
    {
        int i,j;
        int temp;
        boolean swap = true;
        
        if(n<2)
            return;
        
        for(i=0;swap && i<n-1;++i)
        {
            swap=false;
            for(j=0;j<n-1;++j)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    swap=true;
                }
                    
            }
        }
    }
    
    
    public static int partition(int[] A, int left, int right) 
    {
        int x = A[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) 
        {
            if (A[j] < x) 
            {
                i = i + 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i];
        A[i] = A[left];
        A[left] = temp;
 
        return i;
    }
    
    
    public static void quickSort(int[] A, int left, int right) 
    {
        if (left >= right) 
        {
            return;
        }
        int middle = partition(A, left, right);
        quickSort(A, left, middle - 1);
        quickSort(A, middle + 1, right);
    }
    
    public static long S1selection_sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        selection_sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        System.out.println("******************************");
        System.out.println("Selection Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1Insertion_sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        Insertion_sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        System.out.println("******************************");
        System.out.println("Insertion sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1Bubble_Sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        Bubble_Sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        System.out.println("******************************");
        System.out.println("Bubble Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1quickSort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        quickSort(arr,0,size-1);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        System.out.println("******************************");
        System.out.println("Quick Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static void Scenario1(int s[],int size)
    {
        System.out.println("Scenario 1 Rendom Array");
        
        //Selection Sort
        long tselection_sort = S1selection_sort(s,size);
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(s,size);
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(s,size);
        
        //Quick Sort
        long tQuickSort = S1quickSort(s,size);
        
        long minTime = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario2(int s[],int size)
    {
        System.out.println("Scenario 2 Sorted Array");
        int []arr = s.clone();
        Arrays.sort(arr);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        
        //Quick Sort
//        long tQuickSort = S1quickSort(arr,size);
//        long minTime = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long mTime = Math.min(tselection_sort, tInsertion_sort);
        long minTime = Math.min(tBubbleSort, mTime);
        
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
//        else if(minTime==tQuickSort)
//        {
//            fastest = "Quick Sort";
//        }
        
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario3(int s[],int size)
    {
        System.out.println("Scenario 3 Inversely Sorted Array");
        int []arr = s.clone();
        selection_sort_Reversed(arr,size);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        
        //Quick Sort
//        long tQuickSort = S1quickSort(arr,size);
//        long minTime = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long mTime = Math.min(tselection_sort, tInsertion_sort);
        long minTime = Math.min(tBubbleSort, mTime);
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
//        else if(minTime==tQuickSort)
//        {
//            fastest = "Quick Sort";
//        }
        
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario4(int s[],int size)
    {
        System.out.println("Scenario 4 Sorted by 20% Array");
        int []arr = s.clone();
        int tp = size/5;
        Arrays.sort(arr, 0, tp);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        
        //Quick Sort
        long tQuickSort = S1quickSort(arr,size);
        
        long minTime = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void main(String[] args) 
    {
        int []x = new Random().ints(1000000).toArray() ;
        
        Scenario1(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario2(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario3(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario4(x,x.length);
    }
}