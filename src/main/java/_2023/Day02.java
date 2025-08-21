package _2023;

import model.Day;

import java.util.ArrayList;
import java.util.List;

public class Day02 extends Day {

    public static void main(String[] args) {

        Day02 day02 = new Day02();

        int blueCubes = 14;
        int greenCubes = 13;
        int redCubes = 12;

        List<String> lines = new ArrayList<>(day02.readsInput());
        List<Integer> possibleGames = new ArrayList<>();

        for (String line: lines) {

            boolean possible = true;
            List<String> gameSet = List.of(line.split(";"));

            for (String set: gameSet) {

                if (set.contains("blue")){
                    if (Integer.parseInt(set.substring(set.indexOf("blue")-3 ,set.indexOf("blue")).replace(" ", "")) > blueCubes){
                        possible = false;
                        break;
                    } else {
                        possible = true;
                    }
                }
                if (set.contains("green") ){
                    if(Integer.parseInt(set.substring(set.indexOf("green")-3 ,set.indexOf("green")).replace(" ", "")) > greenCubes){
                        possible = false;
                        break;
                    } else {
                        possible = true;
                    };
                }
                if (set.contains("red")){
                    if(Integer.parseInt(set.substring(set.indexOf("red")-3 ,set.indexOf("red")).replace(" ", "")) > redCubes ){
                        possible = false;
                        break;
                    } else {
                        possible = true;
                    }
                }

            }

            if(possible){
                possibleGames.add(Integer.parseInt(line.substring( 4,line.indexOf(":")).replace(" ", "")));
            }

        }

        System.out.println(possibleGames.stream().mapToInt(Integer::intValue).sum());
    }
}
