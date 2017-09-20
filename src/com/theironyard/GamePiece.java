package com.theironyard;

public class GamePiece {
    //instance variables=========================

    int positionX;
    int positionY;
    boolean frozen;

    private String name;
    private String color;





    //getters and setters==========================

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPosition() {
        return "Position X: " + this.positionX + ", Position Y: " + this.positionY;
    }







    //constructor============================================

    public GamePiece(int positionX, int positionY, String name, String color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }





    //methods==================================================

    public void freeze () {
        this.frozen = true;
    }

    public void unFreeze () {
        this.frozen = false;
    }

    public void move (int positionX, int positionY) {

        if (!this.frozen) {
            this.positionX = positionX;
            this.positionY = positionY;

        }
    }
}

