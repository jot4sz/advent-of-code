package _2015;

import java.util.*;

public class Day02 extends Day{

    public static int calculateAreaOfBox(int l, int w, int h){
        List<Integer> sides = new ArrayList<>();
        sides.add(l*w);
        sides.add(w*h);
        sides.add(h*l);

        return (2*l*w) + (2*w*h) + (2*h*l) + Collections.min(sides);
    }

    public int getWrappingPeper(){
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

    public static void main(String[] args) {
        System.out.println(new Day02().getWrappingPeper());
    }
}
