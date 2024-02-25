package Obs.java;

import java.util.*;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("1st position");
        jobSite.addVacancy("2nd position");

        Observer firstSubscriber = new Subscriber("Nuray Kabylkhanova");
        Observer secondSubscriber = new Subscriber("Adema Eskalieva");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("3rd position");

        jobSite.removeVacancy("1st position");
    }
}

