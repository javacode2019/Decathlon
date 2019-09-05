package utils;

import model.Athlete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PointsCalculation {
    private static int maxPoints = 10000;
    private static int position = 1;
    private static int count = 0;
    private List<Athlete> athleteList;

    void athleteCalc(List<String[]> data) {
        setAndSortAthleteValues(data);
        positionAthlete();
        doConvert();
    }

    private void doConvert() {
        ConvertToXml c = new ConvertToXml();
        c.convert(getAthleteList());
    }

    private void positionAthlete() {
        getAthleteList().get(0).setPosition(String.valueOf(position));
        for (int i = 1; i < getAthleteList().size(); i++) {
            if (getAthleteList().get(i).getTotalPoints() != getAthleteList().get(i - 1).getTotalPoints()) {
                position++;
                getAthleteList().get(i).setPosition(String.valueOf(position));
                count = 0;
            } else {
                getAthleteList().get(i - 1).setPosition(String.valueOf(position - count));
                getAthleteList().get(i).setPosition(String.valueOf(position - count));
                position++;
                count++;
            }
        }
        addPositionRange();
    }

    private void addPositionRange() {
        for (Athlete a : getAthleteList()) {
            int endPoint = Integer.parseInt(a.getPosition()) + (getMap().get(a.getTotalPoints()) - 1);
            if (getMap().get(a.getTotalPoints()) != 1) {
                a.setNewPosition(a.getPosition() + " - " + endPoint);
            } else {
                a.setNewPosition(a.getPosition());
            }
        }
    }

    private Map<Integer, Integer> getMap() {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Athlete item : getAthleteList()) {

            if (countMap.containsKey(item.getTotalPoints()))
                countMap.put(item.getTotalPoints(), countMap.get(item.getTotalPoints()) + 1);
            else
                countMap.put(item.getTotalPoints(), 1);
        }
        return countMap;
    }

    private void setAndSortAthleteValues(List<String[]> data) {
        List<Athlete> athleteList = new ArrayList<>();

        for (String[] strings : data) {
            Athlete athlete = new Athlete();
            athlete.setName(strings[0]);
            athlete.setRunning100mScore(strings[1]);
            athlete.setRunning100mInput(Double.parseDouble(strings[1]));
            athlete.setLongJumpScore(strings[2]);
            athlete.setLongJumpInput(Double.parseDouble(strings[2]));
            athlete.setShortPutScore(strings[3]);
            athlete.setShortPutInput(Double.parseDouble(strings[3]));
            athlete.setHighJumpScore(strings[4]);
            athlete.setHighJumpInput(Double.parseDouble(strings[4]));
            athlete.setRunning400mScore(strings[5]);
            athlete.setRunning400mInput(Double.parseDouble(strings[5]));
            athlete.setHurdlesScore(strings[6]);
            athlete.setHurdlesInput(Double.parseDouble(strings[6]));
            athlete.setDiscusThrowScore(strings[7]);
            athlete.setDiscusThrowInput(Double.parseDouble(strings[7]));
            athlete.setPoleVaultScore(strings[8]);
            athlete.setPoleVaultInput(Double.parseDouble(strings[8]));
            athlete.setJavelinThrowScore(strings[9]);
            athlete.setJavelinThrowInput(Double.parseDouble(strings[9]));
            String running1500m = strings[10];
            String[] time = running1500m.split("\\.");
            double minutes = Double.parseDouble(time[0]);
            double seconds = Double.parseDouble(time[1]);
            double milliseconds = Double.parseDouble(time[2]);
            double timeInSeconds = minutes * 60 + seconds + milliseconds / 100;
            athlete.setRunning1500mScore(timeInSeconds);
            athlete.setRunning1500mInput(timeInSeconds);
            if (athlete.getTotalPoints() <= maxPoints) {
                athleteList.add(athlete);
            } else {
                System.out.println("Wrong file data data");
            }
            athleteList.sort(new SortingByPlace());
            setAthleteList(athleteList);
        }
    }

    private List<Athlete> getAthleteList() {
        return athleteList;
    }

    private void setAthleteList(List<Athlete> athleteList) {
        this.athleteList = athleteList;
    }

}
