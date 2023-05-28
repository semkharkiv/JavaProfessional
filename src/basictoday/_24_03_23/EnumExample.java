package basictoday._24_03_23;

public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;

//        System.out.println(day);
//        System.out.println(Arrays.toString(DayOfWeek.values()));
//        System.out.println(DayOfWeek.valueOf("MONDAY"));
        morningGreeting(day);
    }

    private static void morningGreeting(DayOfWeek day) {
        switch (day){
            case MONDAY -> System.out.println("Hard day");
            case TUESDAY -> System.out.println("Better");
            case WEDNESDAY -> System.out.println(" Middle of the week");
            case THURSDAY -> System.out.println("Thursday greeting");
            case FRIDAY -> System.out.println("Last work day");
        }
    }


}
