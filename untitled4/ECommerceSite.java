package Obs.java;

import java.util.List;
import java.util.ArrayList;
public class ECommerceSite implements Observed {
    List<String> products = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addProduct(String product) {
        this.products.add(product);
        notifyObservers();
    }

    public void removeProduct(String product) {
        this.products.remove(product);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.products);
        }
    }
}
