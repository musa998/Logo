package com.java.project.draw;

import java.util.ArrayList;
import java.util.List;

public class MMlogo {

    private List<String> lines;
    private int starsNum;
    private int startDashesNum;
    private int middleDashesNum;

    public MMlogo(){
        this.lines = new ArrayList<>();
    }

    public void addLine(String line){
        this.lines.add(line);
    }


    public List<String> getLines() {
        return lines;
    }

    public int getStarsNum() {
        return starsNum;
    }

    public void setStarsNum(int n, int rowNumber) {
        this.starsNum = n + 2 *rowNumber;
    }

    public int getStartDashesNum() {
        return startDashesNum;
    }

    public void setStartDashesNum(int n, int rowNumber) {
        this.startDashesNum = n - rowNumber;
    }

    public int getMiddleDashesNum() {
        return middleDashesNum;
    }

    public void setMiddleDashesNum(int n, int rowNumber) {
        this.middleDashesNum = n - 2 * rowNumber;
    }
}
