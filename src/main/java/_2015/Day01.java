package _2015;

import java.util.ArrayList;
import java.util.List;

public class Day01 extends Day {

    public List<Integer> findFloor(){
        List<Integer> results = new ArrayList<>();
        int count = 0;
        String line = this.readsInput().getFirst();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '('){
                count++;
            } else {
                count --;
            }
            if (count == -1 && results.size() == 0){
             results.add(i + 1);
            }
        }

        results.add(count);
        
        return results.reversed();
    }

    public static void main(String[] args) {
        Day01 day01 = new Day01();
        System.out.println(day01.findFloor());
    }
}

