package model;

public class Athlete   extends Score{

    private String name;
    private int totalScore;
    private String position;
    private String newPosition;

    public int getTotalPoints() {
        totalScore = (int) (getRunning100mScore() + getLongJumpScore() + getShortPutScore() + getHighJumpScore() + getRunning400mScore() +
                getHurdlesScore() + getDiscusThrowScore() + getPoleVaultScore() + getJavelinThrowScore() + getRunning1500mScore());

        return totalScore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
    }


}
