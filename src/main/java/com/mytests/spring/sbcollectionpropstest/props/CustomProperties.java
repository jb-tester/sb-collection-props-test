package com.mytests.spring.sbcollectionpropstest.props;


import com.mytests.spring.sbcollectionpropstest.data.Person;
import com.mytests.spring.sbcollectionpropstest.data.SomeTask;
import com.mytests.spring.sbcollectionpropstest.data.StateEnum;
import com.mytests.spring.sbcollectionpropstest.data.TestEnum;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;


@Component
@ConfigurationProperties(prefix = "demo")
public class CustomProperties {

    List<SomeTask> tasks;
    private String test_str_prop;
    private List<Person> people;
    private List<TestEnum> enums;

    //@NestedConfigurationProperty
    private SomeTask task;

    private List<InnerTask> innerTasks;
    private InnerEnum innerEnum;

    public String getTest_str_prop() {
        return test_str_prop;
    }

    public void setTest_str_prop(String test_str_prop) {
        this.test_str_prop = test_str_prop;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<TestEnum> getEnums() {
        return enums;
    }

    public void setEnums(List<TestEnum> enums) {
        this.enums = enums;
    }

    public SomeTask getTask() {
        return task;
    }

    public void setTask(SomeTask task) {
        this.task = task;
    }

    public List<SomeTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<SomeTask> tasks) {
        this.tasks = tasks;
    }

    public List<InnerTask> getInnerTasks() {
        return innerTasks;
    }

    public void setInnerTasks(List<InnerTask> innerTasks) {
        this.innerTasks = innerTasks;
    }

    public InnerEnum getInnerEnum() {
        return innerEnum;
    }

    public void setInnerEnum(InnerEnum innerEnum) {
        this.innerEnum = innerEnum;
    }

    @Override
    public String toString() {
        return "CustomProperties{" +
               "people=" + people +
               "enum= " + enums +
               '}';
    }

    public static class InnerTask{

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
    }

    public enum InnerEnum {
        first,second,third
    }
}
