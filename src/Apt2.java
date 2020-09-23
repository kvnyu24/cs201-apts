import apt2.*;

public class Apt2 {
    public static void main(String[] args) throws Exception {
        // DNAMaxNucleotide
        // String[] strands = new String[] {"taattt", "agt", "aagt", "ccatg"};
        // String nuc = "a";

        // DNAMaxNucleotide dna = new DNAMaxNucleotide();
        // System.out.println(dna.max(strands, nuc));


        // SandwichBar
        // String[] available = new String[] { "cheese", "cheese", "cheese", "tomato" };
        // String[] orders = new String[] { "ham ham ham", "water", "pork", "bread", "cheese tomato cheese", "beef" };
 
        // SandwichBar sdbar = new SandwichBar();
        // System.out.println(sdbar.whichOrder(available, orders));

        
        // SimpleWordGame
        // String[] player = new String[] { "lidi", "o", "lidi", "gnbewjzb", "kten",
        // "ebnelff", "gptsvqx", "rkauxq", "rkauxq", "kfkcdn"};
        // String[] dictionary = new String[] { "nava", "wk", "kfkcdn", "lidi", "gptsvqx",
        // "ebnelff", "hgsppdezet", "ulf", "rkauxq", "wcicx"};

        // SimpleWordGame swg = new SimpleWordGame();
        // System.out.println(swg.points(player, dictionary));


        // TxMsg
        // String original = "aeiou bcdfghjklmnpqrstvwxyz";

        // TxMsg txmsg = new TxMsg();
        // System.out.println(txmsg.getMessage(original));


        // Common 
        // String a = "horse";
        // String b = "short";

        // Common cmmn = new Common();
        // System.out.println(cmmn.count(a, b));
        
        // Point Trial (quiz)
        Point p = new Point(1, 2);
        Point q = new Point(1, 2);
        Boolean r = p.hashCode() == q.hashCode();
        System.out.println(r);
    }
}