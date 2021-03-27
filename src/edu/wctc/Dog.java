package edu.wctc;

public class Dog extends Pet implements Talkable {
    private boolean friendly;

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;
    }

    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}