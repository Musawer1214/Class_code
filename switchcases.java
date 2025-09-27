public class switchcases {
    private enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            switch (day) {
                case MONDAY:
                    System.out.println("Monday: Work on project ");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday: Attend meetings");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday: Focus on coding");
                    break;
                case THURSDAY:
                    System.out.println("Thursday: Prepare presentation.");
                    break;
                case FRIDAY:
                    System.out.println("Friday: Other tasks.");
                    break;
                case SATURDAY:
                    System.out.println("Saturday: Take a long walk.");
                    break;
                case SUNDAY:
                    System.out.println("Sunday: Rest.");
                    break;
            }
        }
    }
}
