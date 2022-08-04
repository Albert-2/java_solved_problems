import java.util.stream.*;
import java.util.*;
 
class ArraysLists 
{
    public static int[] removeIndex(int[] arr, int index)
    {
        if (arr==null||index<0||index>=arr.length) 
        {
            return arr;
        }
         List<Integer> arrayList = IntStream.of(arr).boxed().collect(Collectors.toList());
         arrayList.remove(index);
         return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter  elements:");
        for (int i=0;i<n;i++) 
        {
            a[i]=sc.nextInt();
        } 
        System.out.print("Original Array: "+ Arrays.toString(a)); 
        System.out.println();
        System.out.print("Enter index number to be deleted:");
        int m = sc.nextInt();
        a = removeIndex(a, m);
        System.out.println("Resultant Array: "+ Arrays.toString(a));
        sc.close();
    }
}