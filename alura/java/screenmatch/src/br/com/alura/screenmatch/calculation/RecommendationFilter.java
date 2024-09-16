package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Title;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classification classif) {
        if (classif.getClassification() >= 4) {
            System.out.println("PEAK!");
        } else if (classif.getClassification() >= 2) {
            System.out.println("Good rated!");
        } else {
            System.out.println("Watch later");
        }
    }
}
