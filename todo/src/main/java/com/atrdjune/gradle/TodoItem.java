package com.atrdjune.gradle;

/**
 * Created by atrdjune on 17/7/23.
 */
public class TodoItem {
    private String name;
    private boolean hasDone;
    public TodoItem(String n) {name = n;}
    public String getName() {return this.name;}
    public void setName(String n) {name = n;}
    public boolean isHasDone() {return hasDone;}
    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }
    public String toString() {
        return name + (isHasDone() ? " Finished" : " Unfinished");
    }
}
