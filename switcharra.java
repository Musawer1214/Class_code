public class switcharra {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,1,1,1,1};
        int[] b = {2,2,2,2,2,2,2,2,2,2};

        
        int[] temp = a;
        a = b;
        b = temp;

    
        System.out.print("Array a: ");
        for (int n : a) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.print("Array b: ");
        for (int n : b) {
            System.out.print(n + " ");
        }
    }
}
