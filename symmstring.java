import java.util.Scanner;

public class symmstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isSymmetric(str)) {
            System.out.println(str + " is a symmetric string.");
        } else {
            System.out.println(str + " is NOT a symmetric string.");
        }

        sc.close();
    }
    
    public static boolean isSymmetric(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  
            }
            left++;
            right--;
        }
        return true; 
    }
}
