package _2015;

import model.Day;

import java.util.HashSet;

public class Day03 extends Day {

    public Integer presentsDeliveredWithRobo(){
        String line = this.readsInput().getFirst();
        HashSet<String> delivered = new HashSet<>();

        int xRobo = 0;
        int yRobo = 0;

        int xSanta = 0;
        int ySanta = 0;

        delivered.add(xSanta +", "+ ySanta);

        for (int i = 0; i < line.length(); i++) {
            if(i % 2 == 0){
                switch (line.charAt(i)){
                    case '>':
                        xSanta++;
                        break;
                    case '<':
                        xSanta--;
                        break;
                    case '^':
                        ySanta++;
                        break;
                    case 'v':
                        ySanta--;
                        break;
                }
                delivered.add(xSanta +", "+ ySanta);
            } else {
                switch (line.charAt(i)){
                    case '>':
                        xRobo++;
                        break;
                    case '<':
                        xRobo--;
                        break;
                    case '^':
                        yRobo++;
                        break;
                    case 'v':
                        yRobo--;
                        break;
                }
                delivered.add(xRobo +", "+ yRobo);
            }
        }
        return delivered.size();
    }

    public Integer presentsDelivered(){
        String line = this.readsInput().getFirst();
        HashSet<String> delivered = new HashSet<>();

        int x = 0;
        int y = 0;

        delivered.add(x +", "+ y);

        for (int i = 0; i < line.length(); i++) {

            switch (line.charAt(i)){
                case '>':
                    x++;
                    break;
                case '<':
                    x--;
                    break;
                case '^':
                    y++;
                    break;
                case 'v':
                    y--;
                    break;
            }
            delivered.add(x +", "+ y);
        }
        return delivered.size();
    }



    public static void main(String[] args) {
        System.out.println(new Day03().presentsDeliveredWithRobo());

    }
}
