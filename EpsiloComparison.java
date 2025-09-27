public class EpsiloComparison {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 0.9999999999999999;
        
        // Epsilon for tolerance
        double EPSILON = 0.00000001; 
        
        if (x > y || Math.abs(x - y) < EPSILON) {
            System.out.println("x is greater than or approximately equal to y.");
        } else {
            System.out.println("x is less than y.");
        }
    }
}