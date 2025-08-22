package _2015;

import model.Day;

import java.util.HashSet;

public class Day03 extends Day {

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
        System.out.println(new Day03().presentsDelivered());

    }
}
