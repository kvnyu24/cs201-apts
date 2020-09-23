package apt5;
import java.util.*;

public class Thesaurus {
    boolean keepCombine = true;

    public String[] edit(String[] entry) {
        ArrayList<Set<String>> allWords = new ArrayList<Set<String>>();

        for (String ent: entry) {
            Set<String> words = new TreeSet<String>(Arrays.asList(ent.split(" "))); 
            allWords.add(words);
        }

        System.out.println("All words:");
        System.out.println(allWords);

        ArrayList<Set<String>> setArray = combine2(allWords);
        // System.out.println(setArray);
        while (keepCombine) {
            System.out.println("Big loop");
            System.out.println(setArray);
            setArray = combine2(setArray);
        }

        ArrayList<String> ret = new ArrayList<String>();

        for (Set<String> wordSet: setArray) {
            ret.add(String.join(" ", wordSet));
        }

        String[] retArray = ret.toArray(new String[ret.size()]);
        Arrays.sort(retArray);

        return retArray;
    }

    public ArrayList<Set<String>> combine2(ArrayList<Set<String>> setArray) {
        ArrayList<Set<String>> setArrayCopy = new ArrayList<>(setArray);
        boolean breakOuterLoop = false;

        for (int i=0; i<setArrayCopy.size(); i++) {
            System.out.println("Small loop");
            if(breakOuterLoop) {
                System.out.println("Broken");
                break;
            }
            for (int j=i+1; j<setArrayCopy.size(); j++) {
                System.out.println("Ex-small loop");
                Set<String> setUnion = setArrayCopy.get(i);
                Set<String> setUnionCopy = new TreeSet<>(setUnion);
                
                System.out.println(String.format("printing the %d th element", i));
                System.out.println(setUnion);
                setUnionCopy.retainAll(setArrayCopy.get(j));
                System.out.println(String.format("printing the union between the %d and the %d th element", i, j));
                System.out.println(setUnionCopy);


                if (setUnionCopy.size() >= 2) {
                    Set<String> wordNew = setArrayCopy.get(i);
                    wordNew.addAll(setArrayCopy.get(j));
                    System.out.println("printing the combined new word entry");
                    System.out.println(wordNew);
                    setArrayCopy.remove(i);
                    setArrayCopy.remove(j-1);
                    setArrayCopy.add(wordNew);
                    System.out.println(setArrayCopy);
                    breakOuterLoop = true;
                    break;
                }
            }
            if (i==setArray.size()-1) {
                System.out.println("Ends here");
                keepCombine = false;
            }
        }


        return setArrayCopy;

    }

    public ArrayList<Set<String>> combine(ArrayList<Set<String>> setArray) {
        boolean breakOuterLoop = false;
        for (int i=0; i<setArray.size(); i++) {
            System.out.println(i);
            System.out.println(setArray);
            if(breakOuterLoop) {
                break;
            }
            for (int j=i+1; j<setArray.size(); j++) {
                Set<String> setUnion = setArray.get(i);
                setUnion.retainAll(setArray.get(j));
                if (setUnion.size() >= 2) {
                    Set<String> wordNew = setArray.get(i);
                    wordNew.addAll(setArray.get(j));
                    setArray.remove(i);
                    setArray.remove(j-1);
                    setArray.add(wordNew);
                    System.out.println(setArray);
                    breakOuterLoop = true;
                    break;
                }
            }
            if (i==setArray.size()-1) {
                System.out.println(keepCombine);
                keepCombine = false;
            }
        }
        // setArray.addAll(combine(setArray));

        return setArray;
    }
}
