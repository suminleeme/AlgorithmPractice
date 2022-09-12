package ProgrammersLecture;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Word {
    String word;
    int depth;
    Word(String w, int d) {
        word = w;
        depth = d;
    }
}

class SolutionChangeWord {

    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;

        Set<String> used = new HashSet<>();

        Stack<Word> stack = new Stack<>();
        stack.add(new Word(begin, 0));

        while (!stack.isEmpty()) {
            Word now = stack.pop();

            if (now.word.equals(target)) {
                return now.depth;
            }

            for (String w : words) {
                if (!changeable(now.word, w)) continue;
                if (used.contains(w)) continue;

                used.add(w);
                stack.push(new Word(w, now.depth + 1));
            }
        }
        return 0;
    }

    boolean changeable(String w1, String w2) {
        int len = Math.min(w1.length(), w2.length());
        int count = 0;

        for (int i=0; i<len && count < 2; i++) {
            if(w1.charAt(i) != w2.charAt(i)) count++;
        }
        return count == 1;
    }

}

public class ChangeWord {
    public static void main(String[] args) {
        SolutionChangeWord solutionChangeWord = new SolutionChangeWord();

        String begin = "hit";
        String target = "cog";
        String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words2 = {"hot", "dot", "dog", "lot", "log"};

        System.out.println(solutionChangeWord.solution(begin, target, words1));
        System.out.println(solutionChangeWord.solution(begin, target, words2));
    }
}
