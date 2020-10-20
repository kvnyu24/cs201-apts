import apt8.*;

public class Apt8 {
    public static void main(String[] args) throws Exception {
        // LengthSort
        // String[] values = new String[]{"cat", "bat", "flavor", "yellow", "easy", "code"};

        // LengthSort ls = new LengthSort();
        // for (String str: ls.rearrange(values)) {
        //     System.out.println(str);
        // }



        // SortByFreq

        // String[] data = new String[]{"apple", "pear", "cherry", "apple", "pear", "apple", "banana"};
        
        // SortByFreqs sbf = new SortByFreqs();
        // for (String str: sbf.sort(data)) {
        //     System.out.println(str);
        // }
        
        
        // SortedFreqs
        // String[] data = new String[]{"apple", "pear", "apple", "pear", "apple", "pear"};

        // SortedFreqs sf = new SortedFreqs();
        // for (int i: sf.freqs(data)) {
        //     System.out.println(i);
        // }


        // MedalTable
        // String[] results = new String[]{"ITA JPN AUS", "KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE"};

        // MedalTable mt = new MedalTable();
        // for (String str: mt.generate(results)) {
        //     System.out.println(str);
        // }

        
        // SyllableSort
        // String[] words = new String[]{"raba", "rabaza", "raba"};

        // SyllableSorting ss = new SyllableSorting();
        // for (String str: ss.sortWords(words)) {
        //     System.out.println(str);
        // }


        // TournamentRanker
        String[] names = new String[]{"A", "B", "C", "D"};
        String[] lostTo = new String[]{"D", "", "B", "B"};

        TournamentRanker tr = new TournamentRanker();
        for (String str: tr.rankTeams(names, lostTo)) {
            System.out.println(str);
        }




    }
    
}
