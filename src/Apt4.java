import apt4.*;

public class Apt4 {
    public static void main(String[] args) throws Exception {
        // Anonymous
        // String[] headlines = new String[] {"AaBbCc ", " ", " Zz "};
        // String[] messages = new String[] {" ", " sss ", " AAA " };

        // Anonymous anonym = new Anonymous();
        // System.out.println(anonym.howMany(headlines, messages));


        // MemberCheck
        // String[] club1 = new String[] {"JOHN","JOHN","FRED","PEG"};
        // String[] club2 = new String[] {"PEG","GEORGE"};
        // String[] club3 = new String[] {"GEORGE","DAVID"};

        // MemberCheck mc = new MemberCheck();
        // for (String m: mc.whosDishonest(club1, club2, club3)) {
        //     System.out.println(m);
        // }


        // Encryption
        // String message = "hello";
        // Encryption encrypt = new Encryption();

        // System.out.println(encrypt.encrypt(message));


        // SoccerLeagues
        // String[] matches = new String[] {"-DD",
        // "L-L",
        // "WD-"};

        // SoccerLeagues sl = new SoccerLeagues();
        // for (int num: sl.points(matches)) {
        //     System.out.println(num);
        // }   
        
        
        // Isomorphic Words
        String[] words = new String[] {"aa", "ab", "bb", "cc", "cd"};
        
        IsomorphicWords imw = new IsomorphicWords();
        System.out.println(imw.countPairs(words));
    }
}
