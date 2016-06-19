package com.epam.mykhailenko;

/**
 * Created by Antonina_Mykhailenko on 15.06.2016.
 */
public class ConsoleEventLogger implements EventLogger{
    public void logEvent(Event event) {
        event.toString();
    }
}
