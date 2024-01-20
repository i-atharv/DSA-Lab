import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int f=0;
        int a=0;
        System.out.print("Enter the value you want to search in the array: ");
        int x= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x) {
                f = 1;
                a=i;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("The element "+x+" Found at Index "+a+" In the array");
        }
        else
            System.out.println("The element "+x+" Not Found");
    }
}
