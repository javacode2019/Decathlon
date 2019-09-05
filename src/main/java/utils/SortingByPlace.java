package utils;

import model.Athlete;

import java.util.Comparator;

public class SortingByPlace implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        return (String.valueOf(o2.getTotalPoints()).compareTo(String.valueOf(o1.getTotalPoints())));
    }
}