package com.theironyard;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        //create GamePiece =================================

        System.out.println("create GamePiece");

        Random randomNumber = new Random();





        //check initial position
        //Position X: 0, Position Y: 0 ================================

        GamePiece GamePiece = new GamePiece(0,0,"knight","blue");

        System.out.println("check initial position");
        System.out.println(GamePiece.getPosition());





        //check position after moving
        //Position X: 25, Position Y: 45 ===============================

        GamePiece.move(randomNumber.nextInt(100), randomNumber.nextInt(100));

        System.out.println("check position after moving");
        System.out.println(GamePiece.getPosition());





        //GamePiece after freeze but not moving
        //Position X: 25, Position Y: 45 ===============================

        GamePiece.freeze();

        System.out.println("GamePiece after freeze but not moving");
        System.out.println(GamePiece.getPosition());






        //amePiece after freeze and moving
        //Position X: 25, Position Y: 45 ================================

        GamePiece.move(randomNumber.nextInt(100), randomNumber.nextInt(100));

        System.out.println("GamePiece after freeze and moving");
        System.out.println(GamePiece.getPosition());






        //GamePiece after unFreeze and moving
        //Position X: 200, Position Y: 200 ===============================

        GamePiece.unFreeze();

        GamePiece.move(randomNumber.nextInt(100), randomNumber.nextInt(100));

        System.out.println("GamePiece after unFreeze and moving");
        System.out.println(GamePiece.getPosition());


    }


}

