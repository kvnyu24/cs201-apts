package apt8;
import java.util.*;

public class SyllableSorting {
    private static final String[] VOWELS = new String[] {"a", "e", "i", "o", "u"};

    public String[] sortWords(String[] words) {
        ArrayList<Syllable> syllables = new ArrayList<>();
        for (String word: words) {
            Syllable syllable = new Syllable(word);
            syllable.genSyllables();
            syllables.add(syllable);
        }

        Comparator<Syllable> compareSyllable =  Comparator.<Syllable> naturalOrder();
        Collections.sort(syllables, compareSyllable);


        ArrayList<String> ret = new ArrayList<>();
        for (Syllable sy: syllables) {
            ret.add(sy.getOriginal());
        }

        return ret.toArray(new String[ret.size()]); 
    }

    private class Syllable implements Comparable<Syllable>{
        private String original;
        private ArrayList<String> unsortedSyllables;
        private ArrayList<String> syllables;


        public Syllable(String original) {
            this.original = original; 
            this.unsortedSyllables = new ArrayList<>();
            this.syllables = new ArrayList<>();
        }

        public void genSyllables() {
            int lastInd = 0;
            for (int i=0; i<original.length()-2; i++) {
                if (Arrays.asList(VOWELS).contains(original.substring(i, i+1)) && !Arrays.asList(VOWELS).contains(original.substring(i+1, i+2))) {
                    unsortedSyllables.add(original.substring(lastInd, i+1));
                    lastInd = i+1;
                }
            }
            unsortedSyllables.add(original.substring(lastInd));
            syllables = new ArrayList<String>(unsortedSyllables.size());

            for (String str: unsortedSyllables) {
                syllables.add(str);
            }

            Collections.sort(syllables);
        }

        public String getOriginal() {
            return original;
        }

        public String[] getSyllables() {
            return syllables.toArray(new String[syllables.size()]);
        }

        public String[] getUnsortedSyllables() {
            return unsortedSyllables.toArray(new String[unsortedSyllables.size()]);
        }

        @Override
        public int compareTo(Syllable syllable) {
            for (int i=0; i<Math.min(syllables.size(), syllable.getSyllables().length); i++) {
                int res = syllables.get(i).compareTo(syllable.getSyllables()[i]);
                if (res != 0) {
                    return res;
                }
            }
            if (syllables.size() > syllable.getSyllables().length) {
                return 1;
            } else if (syllables.size() < syllable.getSyllables().length) {
                return -1;
            }
            for (int i=0; i<Math.min(syllables.size(), syllable.getSyllables().length); i++) {
                int res = unsortedSyllables.get(i).compareTo(syllable.getUnsortedSyllables()[i]);
                if (res != 0) {
                    return res;
                }
            }

            return 0;
        }
    

        @Override
        public String toString() {
            return String.join("", syllables.toArray(new String[syllables.size()]));
        }
    }
 }
