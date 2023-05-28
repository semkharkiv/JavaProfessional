package main.basictoday._24_03_23;

public enum DayOfWeek {
    MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"),THURSDAY("Thursday"),FRIDAY("Friday");

    private final String value;

    DayOfWeek(String s){
        this.value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
