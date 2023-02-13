package com.eliseu;

import java.util.ArrayList;
import java.util.List;

public class StringToArray {

    public static String[] parseString(String input) {
        List<String> result = new ArrayList<>();
        String[] lines = input.split("\n");
        for (String line : lines) {
            result.add(line.split("=")[1]);//retorna o valor que esta na posicao 1 do vetor
        }
        return result.toArray(new String[result.size()]);
    }

    public static String[] retorna(String input) {
        List<String> result = new ArrayList<>();
        String[] lines = input.split("\n");
        for (String line : lines) {
            String[] parts = line.split("=");
            if (parts.length >= 2) {
                result.add(parts[1]);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static String[] preparaHash(String input) {

    }

}
