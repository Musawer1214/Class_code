public class ConstructorDemo {

    // 1. Object initialized directly at the field level (outside any method)
    private final Helper fieldHelper = new Helper("Field-level initialization");

    // 1. Object initialized inside an instance initializer block (no method involved)
    {
        Helper blockHelper = new Helper("Instance initializer block");
        blockHelper.printInfo();
    }

    public ConstructorDemo() {
        System.out.println("Default ConstructorDemo constructor");
    }

    // 2 & 3. Constructor chaining with `this()` to reuse initialization logic
    public ConstructorDemo(String info) {
        this(); // 3. Calls the no-arg constructor
        Helper constructorHelper = new Helper(info);
        constructorHelper.printInfo();
    }

    public static void main(String[] args) {
        new ConstructorDemo("Constructor-chained initialization");
    }

    private static class Helper {
        public Helper(String origin) {
            System.out.println("Helper created from: " + origin);
        }

        public void printInfo() {
            System.out.println("printInfo() called");
        }
    }
}
