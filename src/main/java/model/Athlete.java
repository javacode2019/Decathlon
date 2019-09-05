package model;

public class Athlete implements Constants {

    private String name;
    private int totalScore;
    private String position;
    private String newPosition;

    private double running100mScore;
    private double longJumpScore;
    private double shortPutScore;
    private double highJumpScore;
    private double running400mScore;
    private double hurdlesScore;
    private double discusThrowScore;
    private double poleVaultScore;
    private double javelinThrowScore;
    private double running1500mScore;

    private double running100mInput;
    private double longJumpInput;
    private double shortPutInput;
    private double highJumpInput;
    private double running400mInput;
    private double hurdlesInput;
    private double discusThrowInput;
    private double poleVaultInput;
    private double javelinThrowInput;
    private double running1500mInput;

    public int getTotalPoints() {
        totalScore = (int) (getRunning100mScore() + getLongJumpScore() + getShortPutScore() + getHighJumpScore() + getRunning400mScore() +
                getHurdlesScore() + getDiscusThrowScore() + getPoleVaultScore() + getJavelinThrowScore() + getRunning1500mScore());

        return totalScore;
    }

    public double getRunning100mScore() {
        return running100mScore;
    }

    public void setRunning100mScore(String running100mScore) {
        this.running100mScore = Double.parseDouble(running100mScore);
        this.running100mScore = Math.floor(formulaConstantA[0] * Math.pow(formulaConstantB[0] - getRunning100mScore(), formulaConstantC[0]));

    }

    public double getLongJumpScore() {
        return longJumpScore;
    }

    public void setLongJumpScore(String longJumpScore) {
        this.longJumpScore = Double.parseDouble(longJumpScore);
        this.longJumpScore = Math.floor(formulaConstantA[1] * Math.pow(getLongJumpScore() * 100 - formulaConstantB[1], formulaConstantC[1]));
    }

    public double getShortPutScore() {
        return shortPutScore;
    }

    public void setShortPutScore(String shortPutScore) {
        this.shortPutScore = Double.parseDouble(shortPutScore);
        this.shortPutScore = Math.floor(formulaConstantA[2] * Math.pow(getShortPutScore() - formulaConstantB[2], formulaConstantC[2]));
    }

    public double getHighJumpScore() {
        return highJumpScore;
    }

    public void setHighJumpScore(String highJumpScore) {
        this.highJumpScore = Double.parseDouble(highJumpScore);
        this.highJumpScore = Math.floor(formulaConstantA[3] * Math.pow(getHighJumpScore() * 100 - formulaConstantB[3], formulaConstantC[3]));
    }

    public double getRunning400mScore() {
        return running400mScore;
    }

    public void setRunning400mScore(String running400mScore) {
        this.running400mScore = Double.parseDouble(running400mScore);
        this.running400mScore = Math.floor(formulaConstantA[4] * Math.pow(formulaConstantB[4] - getRunning400mScore(), formulaConstantC[4]));
    }

    public double getHurdlesScore() {
        return hurdlesScore;
    }

    public void setHurdlesScore(String hurdlesScore) {
        this.hurdlesScore = Double.parseDouble(hurdlesScore);
        this.hurdlesScore = Math.floor(formulaConstantA[5] * Math.pow(formulaConstantB[5] - getHurdlesScore(), formulaConstantC[5]));
    }

    public double getDiscusThrowScore() {
        return discusThrowScore;
    }

    public void setDiscusThrowScore(String discusThrowScore) {
        this.discusThrowScore = Double.parseDouble(discusThrowScore);
        this.discusThrowScore = Math.floor(formulaConstantA[6] * Math.pow(getDiscusThrowScore() - formulaConstantB[6], formulaConstantC[6]));
    }

    public double getPoleVaultScore() {
        return poleVaultScore;
    }

    public void setPoleVaultScore(String poleVaultScore) {
        this.poleVaultScore = Double.parseDouble(poleVaultScore);
        this.poleVaultScore = Math.floor(formulaConstantA[7] * Math.pow(getPoleVaultScore() * 100 - formulaConstantB[7], formulaConstantC[7]));
    }

    public double getJavelinThrowScore() {
        return javelinThrowScore;
    }

    public void setJavelinThrowScore(String javelinThrowScore) {
        this.javelinThrowScore = Double.parseDouble(javelinThrowScore);
        this.javelinThrowScore = Math.floor(formulaConstantA[8] * Math.pow(getJavelinThrowScore() - formulaConstantB[8], formulaConstantC[8]));

    }

    public double getRunning1500mScore() {
        return running1500mScore;
    }

    public void setRunning1500mScore(double running1500mScore) {
        this.running1500mScore = running1500mScore;
        this.running1500mScore = Math.floor(formulaConstantA[9] * Math.pow(formulaConstantB[9] - running1500mScore, formulaConstantC[9]));
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

    public double getRunning100mInput() {
        return running100mInput;
    }

    public void setRunning100mInput(double running100mInput) {
        this.running100mInput = running100mInput;
    }

    public double getLongJumpInput() {
        return longJumpInput;
    }

    public void setLongJumpInput(double longJumpInput) {
        this.longJumpInput = longJumpInput;
    }

    public double getShortPutInput() {
        return shortPutInput;
    }

    public void setShortPutInput(double shortPutInput) {
        this.shortPutInput = shortPutInput;
    }

    public double getHighJumpInput() {
        return highJumpInput;
    }

    public void setHighJumpInput(double highJumpInput) {
        this.highJumpInput = highJumpInput;
    }

    public double getRunning400mInput() {
        return running400mInput;
    }

    public void setRunning400mInput(double running400mInput) {
        this.running400mInput = running400mInput;
    }

    public double getHurdlesInput() {
        return hurdlesInput;
    }

    public void setHurdlesInput(double hurdlesInput) {
        this.hurdlesInput = hurdlesInput;
    }

    public double getDiscusThrowInput() {
        return discusThrowInput;
    }

    public void setDiscusThrowInput(double discusThrowInput) {
        this.discusThrowInput = discusThrowInput;
    }

    public double getPoleVaultInput() {
        return poleVaultInput;
    }

    public void setPoleVaultInput(double poleVaultInput) {
        this.poleVaultInput = poleVaultInput;
    }

    public double getJavelinThrowInput() {
        return javelinThrowInput;
    }

    public void setJavelinThrowInput(double javelinThrowInput) {
        this.javelinThrowInput = javelinThrowInput;
    }

    public double getRunning1500mInput() {
        return running1500mInput;
    }

    public void setRunning1500mInput(double running1500mInput) {
        this.running1500mInput = running1500mInput;
    }
}
