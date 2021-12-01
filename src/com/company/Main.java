package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        for(int i =1; i<101; i++) {
            main.throwTheCube(2);
            System.out.println("-----"+ i + "-----");
        }
    }



    private void throwTheCube(int numOfTheEdges){

        Random rand = new Random();
        int timesOfThrew = 0;
        ArrayList<Integer> arrayOfThrows = new ArrayList<>();

        int numThatWeThrewNow = rand.nextInt(numOfTheEdges)+1;
        arrayOfThrows.add(numThatWeThrewNow);

        //ak sa prve hodene cislo rovna najvacsiemu moznemu
        if(numThatWeThrewNow == numOfTheEdges) {
            while (numThatWeThrewNow == numOfTheEdges) {

                numThatWeThrewNow = rand.nextInt(numOfTheEdges)+1;
                arrayOfThrows.add(numThatWeThrewNow);
                timesOfThrew ++;
            }
            int sum = 0;
            for(int i = 0; i < arrayOfThrows.size(); i++)
                sum += arrayOfThrows.get(i);

            System.out.println(sum+"*"+timesOfThrew);
        }
        //ak sa prve hodene cislo nerovna najvacsiemu moznemu
        else{
            System.out.println(numThatWeThrewNow + "firstTime");
        }

    }
}
