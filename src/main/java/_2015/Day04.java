package _2015;

import model.Day;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day04 extends Day {

    public Integer findAdventCoinNonce() throws NoSuchAlgorithmException {

        StringBuilder secretKey = new StringBuilder(this.readsInput().getFirst());
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest;
        StringBuilder convertedHash = new StringBuilder();
        int i = 1;

        while(true) {

            var input = secretKey.toString() + i;
            digest = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
            convertedHash.setLength(0);

            for (byte b : digest) {
                convertedHash.append(String.format("%02x", b));
            }

            if(convertedHash.toString().startsWith("00000")){
                return i;
            }
            i++;
        }
    }

    public Integer findAdventCoinNonceWithSixZeros() throws NoSuchAlgorithmException {

        StringBuilder secretKey = new StringBuilder(this.readsInput().getFirst());
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest;
        StringBuilder convertedHash = new StringBuilder();
        int i = 1;

        while(true) {

            var input = secretKey.toString() + i;
            digest = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
            convertedHash.setLength(0);

            for (byte b : digest) {
                convertedHash.append(String.format("%02x", b));
            }

            if(convertedHash.toString().startsWith("000000")){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(new Day04().findAdventCoinNonceWithSixZeros());
    }
}
