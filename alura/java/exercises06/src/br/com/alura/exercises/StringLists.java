package br.com.alura.exercises;

import java.util.ArrayList;

public class StringLists {
    public static void main(String[] args) {
        String ph1 =  "Peter Piper picked a peck of pickled peppers.";
        String ph2 = "Betty Botter bought some butter";
        String ph3 = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";

        ArrayList<String> fakeList = new ArrayList<>();
        fakeList.add(ph1);
        fakeList.add(ph2);
        fakeList.add(ph3);

        for (String s : fakeList) {
            System.out.println(s);
        }
    }
}
