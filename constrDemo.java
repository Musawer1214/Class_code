public class constrDemo {

    // === Q1: FIELD INITIALIZER ===
    private final TeamMember ceo = new TeamMember("Ava Harper", "CEO");

    // === Q2: INSTANCE INITIALIZER ===
    {
        System.out.println("== Setting up onboarding kit ==");
        ResourceAccess starterLaptop = new ResourceAccess("Laptop Provisioning");
        starterLaptop.provision();
    }
    // === Q2: NO-ARG CONSTRUCTOR ===

    public constrDemo() {
        System.out.println("Onboarding team for new Project Alpha.");
    }
    // === Q3: OVERLOADED CONSTRUCTOR with this() CALL ===

    public constrDemo(String teamName) {
        this(); // reuse default constructor logic
        System.out.println("Creating project resources for team: " + teamName);
        TeamMember lead = new TeamMember("Jordan Ellis", "Project Lead");
        lead.printBadge();
    }


    public static void main(String[] args) {
        new constrDemo("Alpha Delivery Team");
    }
    // === HELPER CLASSES ===

    private static class TeamMember {
        private final String name;
        private final String role;

        TeamMember(String name, String role) {
            this.name = name;
            this.role = role;
            System.out.println("Team member record created: " + name + " (" + role + ")");
        }



        void printBadge() {
            System.out.println("Printing badge for " + name + " - " + role);
        }

    }

    private static class ResourceAccess {
        private final String resourceName;

        ResourceAccess(String resourceName) {
            this.resourceName = resourceName;
            System.out.println(resourceName + " resource instantiated.");
        }


        void provision() {
            System.out.println("Provisioning " + resourceName + "...");
        }
    }
}
