/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seinecle.utils.text;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.List;

/**
 *
 * @author C. Levallois
 * adapted from http://stackoverflow.com/questions/3656762/n-gram-generation-from-a-sentence
 */
public class NGramFinder {

    private static HashMultiset<String> freqSetN = HashMultiset.create();
    private static int minLength;
    private static String[] words;
    private static List buffer;
    private static int counter = 0;

    public static void ngrams(int n, String str) {

        try {
            words = str.split(" ");
            
       
            

            for (int i = 0; i < words.length - n + 1; i++) {
                    freqSetN.add(concat(words, i, i + n, n));
                }

        } catch (NullPointerException e) {
        }
    }

    public static String concat(String[] words, int start, int end, int ngram) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
        {
            sb.append(i > start ? " " : "").append(words[i]);
        }
        return sb.toString();
    }

    public static Multiset<String> run(String toBeParsed, int nGram) {
        freqSetN.clear();

        for (int n = 1; n <= nGram; n++) {


            ngrams(n, toBeParsed);
        }
        //System.out.println(freqList.get(i));
        return freqSetN;
    }
}
