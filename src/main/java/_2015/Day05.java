package _2015;

import model.Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Day05 extends Day {

    public Integer isNiceCounter(){
        int count = 0;
        List<String> lines = this.readsInput();
        String[] forbiddenString = {"ab", "cd", "pq", "xy"};

        for (String line : lines){
            int vowels = 0;
            boolean hasRepeat = false;
            boolean forbidden = false;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if ("aeiou".indexOf(c) >= 0){
                    vowels++;
                }

                if(i>0 && c == line.charAt(i-1)){
                    hasRepeat = true;
                }
                if (i>0){
                     String par = "" + line.charAt(i-1) + c;
                     if (Arrays.asList(forbiddenString).contains(par)){
                         forbidden = true;
                     }
                }
            }
            if (vowels >= 3 && hasRepeat && !forbidden){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Day05().isNiceCounter());
    }
}
