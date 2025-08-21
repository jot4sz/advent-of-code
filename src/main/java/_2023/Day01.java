package _2023;

import model.Day;

import java.util.*;

public class Day01 extends Day {

    public List<Integer> findDigitsPt1 (){
        List<Integer> integers = new ArrayList<>();
        for (String line : this.readsInput()) {
            String digit = "";

            for (int i = 0 ; i < line.length() ; i++){
                if (Character.isDigit(line.charAt(i))){
                    digit += String.valueOf(line.charAt(i));
                    break;
                }
            }

            for (int i = line.length() - 1 ; i >= 0 ; i--){
                if (Character.isDigit(line.charAt(i))){
                    digit += String.valueOf(line.charAt(i));
                    break;
                }
            }
            integers.add(Integer.parseInt(digit));
        }
        return integers;
    }

    public static int sumDigits(List<Integer> list){
        return list.stream().mapToInt(Integer::valueOf).sum();
    }

    public List<Integer> findDigitsPt2() {

        List<Integer> integers = new ArrayList<>();
        Map<String, String> mapDigits = new HashMap<>();

        mapDigits.put("one", "1");
        mapDigits.put("two", "2");
        mapDigits.put("three", "3");
        mapDigits.put("four", "4");
        mapDigits.put("five", "5");
        mapDigits.put("six", "6");
        mapDigits.put("seven", "7");
        mapDigits.put("eight", "8");
        mapDigits.put("nine", "9");

        for (String line : this.readsInput()) {

            String firstDigit = "";
            for (int i = 0; i < line.length(); i++) {

                for (Map.Entry<String, String> entry : mapDigits.entrySet()) {
                    if (line.substring(0 , i).contains(entry.getKey())) {
                        firstDigit += entry.getValue();
                        break;
                    }
                }
                if (!firstDigit.isEmpty()){
                    break;
                }else if (Character.isDigit(line.charAt(i))){
                    firstDigit += line.charAt(i);
                    break;
                }
            }

            String lastDigit = "";
            for (int i = line.length() - 1; i >= 0; i--) {

                for (Map.Entry<String, String> entry : mapDigits.entrySet()) {
                    if (line.substring(i).contains(entry.getKey())) {
                        lastDigit += entry.getValue();
                        break;
                    }
                }
                if (!lastDigit.isEmpty()) {
                    break;
                } else if (Character.isDigit(line.charAt(i))){
                    lastDigit += line.charAt(i);
                    break;
                }
            }

            integers.add(Integer.parseInt(firstDigit + lastDigit));
        }
        return integers;
    }

    public static void main(String[] args) {
        Day01 day01 = new Day01();

        System.out.println(sumDigits(day01.findDigitsPt1()));
        System.out.println(sumDigits(day01.findDigitsPt2()));
    }
}

