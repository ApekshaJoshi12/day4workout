import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}