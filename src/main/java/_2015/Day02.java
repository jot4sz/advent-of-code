package _2015;

import model.Day;

import java.util.*;

public class Day02 extends Day {

    public static int calculateAreaOfBox(int l, int w, int h){
        List<Integer> sides = new ArrayList<>();
        sides.add(l*w);
        sides.add(w*h);
        sides.add(h*l);

        return (2*l*w) + (2*w*h) + (2*h*l) + Collections.min(sides);
    }
    //part one
    public int getWrappingPaper(){
        List<Integer> paperFoot = new ArrayList<>();

        for (String dimension : this.readsInput()){

            String[] number = dimension.split("x");

            int l = Integer.parseInt(number[0]);
            int w = Integer.parseInt(number[1]);
            int h = Integer.parseInt(number[2]);

            paperFoot.add(calculateAreaOfBox(l,w,h));
        }

        return paperFoot.stream().mapToInt(Integer::intValue).sum();
    }
    //part two
    public int getRibbon() {
        return this.readsInput().stream()
                .mapToInt(dim -> {
                    String[] p = dim.split("x");
                    int l = Integer.parseInt(p[0]);
                    int w = Integer.parseInt(p[1]);
                    int h = Integer.parseInt(p[2]);

                    int volume = l*w*h;

                    Integer[] sides = {l,w,h};

                    Arrays.sort(sides);

                    int shortestSide1 = sides[0];
                    int shortestSide2 = sides[1];

                    int sum = 2*(shortestSide1+shortestSide2) + volume;
                    return sum;
                })
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(new Day02().getRibbon());
    }
}
