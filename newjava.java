// public class newjava {
//     public static void main(String[] args) {

//         int x = 1;

//         int y = f(x);
//         System.out.println(y);
//         System.out.println(x);

//     }
//     public static int f(int var) {
//         var = 0;
//         return var;
//     }
    
// }

// import java.util.Arrays;

// public class newjava {
//     public static void main(String[] args) {
//         int[] x = {1, 2, 3};

//         int[] y = f(x);

//         System.out.println(Arrays.toString(x)); // prints [0, 2, 3]
//         System.out.println(Arrays.toString(y)); // same array, same output
        
//     }

//     public static int[] f(int[] var) {
//         var[0] = 0;


//         System.out.println(Arrays.toString(var)); // prints [0, 2, 3]


//         return var;
//     }
// }



// public class newjava {


//     int[] arr1 = {1, 2, 3};
//     int[] arr2 = {4, 5, 6};
//     public static  swap (arr1, arr2) {
//         int[] temp = arr1;
//         arr1 = arr2;
//         arr2 = temp;

//         System.out.println(Arrays.toString(arr1)); // prints [4, 5, 6]
//         System.out.println(Arrays.toString(arr2)); // prints [1, 2,
//     }

//     }

import java.util.Arrays;

public class newjava {

    static int[] arr1 = {1, 2, 3};
    static int[] arr2 = {4, 5, 6};

    public static void swap(int[] arr1, int[] arr2) {
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;

        System.out.println(Arrays.toString(arr1)); // prints [4, 5, 6]
        System.out.println(Arrays.toString(arr2)); // prints [1, 2, 3]
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr1)); // prints [4, 5, 6]
        System.out.println(Arrays.toString(arr2)); // prints [1, 2, 3]


        swap(arr1, arr2);
    }
}


