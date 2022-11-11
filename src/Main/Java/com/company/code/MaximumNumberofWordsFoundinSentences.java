package com.company.code;

public class MaximumNumberofWordsFoundinSentences {

    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String sentence : sentences) {
            int word = sentence.split(" ").length;
            count = Math.max(count, word);
        }
        return count;
    }

}
