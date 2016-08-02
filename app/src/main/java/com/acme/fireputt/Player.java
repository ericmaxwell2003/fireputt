package com.acme.fireputt;

import java.util.Locale;

public class Player {

    private String name;
    private int score;
    private int parStanding;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getParStanding() {
        return parStanding;
    }

    public void setParStanding(int parStanding) {
        this.parStanding = parStanding;
    }

    public String getParStandingAsString() {
        return String.format(Locale.US, "%s%d", (score < 0 ? "-" : "+"), parStanding);
    }

}
