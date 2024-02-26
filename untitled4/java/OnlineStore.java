package Obs.java;

public class OnlineStore {
    public static void main(String[] args) {
        ECommerceSite site = new ECommerceSite();

        site.addProduct("Iphone");
        site.addProduct("Macbook");

        Observer firstSubscriber = new Subscriber("Nuray Kabylkhanova");
        Observer secondSubscriber = new Subscriber("Adema Eskalieva");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addProduct("Ipad");

        site.removeProduct("Iphone");
    }
}

