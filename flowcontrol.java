// public class flowcontrol {
//     public static void main(String[] args) {
//         int rows = 3;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class flowcontrol {
//     public static void main(String[] args) {
//         int rows = 4;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows - i; j > 0; j--) {
//                 System.out.print("*");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class flowcontrol {
//     public static void main(String[] args) {
//         for (int row = 1; row <= 3; row++) {
//             for (int col = 1; col <= row; col++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class flowcontrol {
//     public static void main(String[] args) {
//         int totalRows = 3;

//         for (int row = 0; row < totalRows; row++) {
//             for (int space = 0; space < row; space++) {
//                 System.out.print(" ");
//             }
//             for (int star = totalRows - row; star > 0; star--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class flowcontrol {
//     public static void main(String[] args) {
//         int halfHeight = 3;   
//         int maxWidth = 6;     

        
//         for (int row = 0; row < halfHeight; row++) {
//             int spaces = halfHeight - row - 1;
//             int stars = maxWidth - (spaces * 2);

//             for (int i = 0; i < spaces; i++) {
//                 System.out.print(" ");
//             }
//             for (int i = 0; i < stars; i++) {
//                 System.out.print("*");
//             }
//             for (int i = 0; i < spaces; i++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

        
//         for (int row = halfHeight - 1; row >= 0; row--) {
//             int spaces = halfHeight - row - 1;
//             int stars = maxWidth - (spaces * 2);

//             for (int i = 0; i < spaces; i++) {
//                 System.out.print(" ");
//             }
//             for (int i = 0; i < stars; i++) {
//                 System.out.print("*");
//             }
//             for (int i = 0; i < spaces; i++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class flowcontrol {
//     public static void main(String[] args) {
//         int max = 10;
//         int fieldWidth = 14; // enough room for "9 X 9 = 81"

//         for (int row = 1; row <= max; row++) {
//             for (int col = 1; col <= max; col++) {
//                 if (col < row) {
//                     System.out.printf("%-" + fieldWidth + "s", "");
//                 } else {
//                     String cell = String.format("%d X %d = %d", row, col, row * col);
//                     System.out.printf("%-" + fieldWidth + "s", cell);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

