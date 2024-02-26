package Obs.java;

import java.util.*;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> products) {
        System.out.println("Dear " + name + "\nWe have made some changes to the store products:\n" + products + "\n ***************************************** \n");
    }
}
