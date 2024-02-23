/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
// Weekdays.java
public class Weekdays {

    public static void main(String[] args) {
        Weekday[] weekdays = Weekday.values();
        for (Weekday weekday : weekdays) {
            System.out.println(weekday.getDayName());
        }
    }
}

enum Weekday {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday");

    private final String dayName;

    Weekday(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}



