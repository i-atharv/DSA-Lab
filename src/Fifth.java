import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the Item: ");
        int x = sc.nextInt();
        System.out.println("Enter the position: ");
        int p=sc.nextInt();
        int[] arr1=new int[n+1];
        for(int i=0;i< arr1.length;i++)
        {
            if(i<p-1)
                arr1[i]=arr[i];
            else if(i==p-1)
                arr1[i]=x;
            else
                arr1[i]=arr[i-1];
        }
        for (int j : arr1)
            System.out.print(j+" ");
    }
}