package com.example.assignment9;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor1 = new WordProcessor();
            wordProcessor1.readFile("C:\\Users\\User\\Documents\\Assignment-9-Similarity-calculation-main\\Assignment-9-Similarity-calculation-main\\java\\com\\example\\assignment9\\astrology_file1.txt");
            Set<String> set1 = wordProcessor1.getDistinctWords();

            WordProcessor wordProcessor2 = new WordProcessor();
            wordProcessor2.readFile("C:\\Users\\User\\Documents\\Assignment-9-Similarity-calculation-main\\Assignment-9-Similarity-calculation-main\\java\\com\\example\\assignment9\\astrology_file2.txt");
            Set<String> set2 = wordProcessor2.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double similarity = similarityCalculator.calculateSimilarity(set1, set2);

            System.out.println("Jaccard Similarity Coefficient: " + similarity);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}