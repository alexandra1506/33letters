package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв
Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        String allStrings = "";
        for(String str : list){
            allStrings += str;
        }

        ArrayList<Integer> listCount = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            listCount.add(0);
        }

        for(int i = 0; i < allStrings.length(); i++){
            if(alphabet.contains(allStrings.charAt(i))){
                int index = alphabet.indexOf(allStrings.charAt(i));
                listCount.set(index, listCount.get(index)+1);
            }
        }

        for (int i = 0; i < 33; i++) {
            System.out.println(alphabet.get(i) + " " + listCount.get(i));
        }
    }
}
