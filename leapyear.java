public class leapyear {
    public static void main(String[] args) {
        System.out.println("Leap Years from 1949 to 2024:");
        System.out.println("_________________________");
        
        
        int count = 0;
        
        for (int year = 1949; year <= 2024; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                count++;
                System.out.printf("%d. %d%n", count, year);
            }
        }
        
        System.out.println("_________________________");
        System.out.printf("Total: %d leap years from 1949 to 2024%n", count);
        
    }
}
