package com.epam.mykhailenko;

import java.util.Date;
import java.util.Random;

/**
 * Created by Antonina_Mykhailenko on 15.06.2016.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;

    public Event(String msg, Date date) {
        this.msg = msg;
        this.date = date;
        this.id = Integer.valueOf(new Random().nextInt());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
