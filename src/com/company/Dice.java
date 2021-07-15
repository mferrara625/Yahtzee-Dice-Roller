package com.company;

public class Dice {
   public int num;
   public boolean isHeld;
   public int diceNum;

    public Dice(int diceNum){
        this.diceNum = diceNum;
        this.num = 0;
        this.isHeld = false;
    }
    public void rollDice(){
        if(!isHeld)
        num = (int)(Math.random() * 6) + 1;
    }
    public String toString(){
        return "\n|-----|\n" + "|  " + num + "  |\n" + "|_____|";
    }
}
