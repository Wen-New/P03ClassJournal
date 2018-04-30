package com.myapplicationdev.android.p03classjournal;

public class Info {
    private String dailyGrade;
    private int week;

    public Info(String dailyGrade, int week) {
        this.dailyGrade = dailyGrade;
        this.week = week;
    }

    public String getDailyGrade() {
        return dailyGrade;
    }

    public void setDailyGrade(String dailyGrade) {
        this.dailyGrade = dailyGrade;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
