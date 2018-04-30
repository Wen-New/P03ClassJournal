package com.myapplicationdev.android.p03classjournal;

public class Info {
    private String dailyGrade;
    private String week;

    public Info(String dailyGrade, String week) {
        this.dailyGrade = dailyGrade;
        this.week = week;
    }

    public String getDailyGrade() {
        return dailyGrade;
    }

    public void setDailyGrade(String dailyGrade) {
        this.dailyGrade = dailyGrade;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
