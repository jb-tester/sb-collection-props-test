package com.mytests.spring.sbcollectionpropstest.data;

import java.time.Duration;

public class SomeTask {

    String name;
    Duration duration;
    StateEnum state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SomeTask{" +
               "name='" + name + '\'' +
               ", duration=" + duration +
               ", state=" + state +
               '}';
    }
}
