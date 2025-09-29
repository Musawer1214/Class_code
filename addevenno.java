public class addevenno {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 100:");
        System.out.println("________________________");
        
        
        int sum = 0;
        int count = 0;
        
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sum += number;
                count++;
                System.out.printf("%d. %d%n", count, number);
            }
        }
        
        System.out.println("________________________");
        System.out.printf("Total: %d even numbers from 1 to 100%n", count);
        System.out.printf("Sum of even numbers from 1 to 100: %d%n", sum);
    }
}
