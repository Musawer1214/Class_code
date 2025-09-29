public class dragonyear {
    public static void main(String[] args) {
        System.out.println("Dragon Years since 1949:");
        System.out.println("________________________");
        
        
        int count = 0;
        
        for (int year = 1952; year <= 2024; year += 12) {
            count++;
            System.out.printf("%d. %d", count, year);
            
            
            if (year == 2024) {
                System.out.print(" Last Dragon Year");
            }
            System.out.println();
        }
        
        System.out.println("________________________");
        System.out.printf("Total: %d Dragon years since 1949%n", count);
    }
}