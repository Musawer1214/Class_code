public class oddeven {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) { // odd numbers
                System.out.println(number);
                continue; // skip even-number handling
            }
            System.out.println(number + 1); 
        }
    }
}