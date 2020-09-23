import apt5.*;

public class Apt5 {
    public static void main(String[] args) throws Exception {
        // PairDown
        // int[] list = new int[] {1,2,3};

        // PairDown pd = new PairDown();
        // for (int num: pd.fold(list)) {
        //     System.out.println(num);
        // }


        // SetAside
        // String[] list = new String[] {"one two three four", "two three four five", "five four three two one", "three two one five"};

        // SetAside sa = new SetAside();
        // System.out.println(sa.common(list));


        // Closet
        // String[] list = new String[] {"blue blue water", "blue skies are blue", "blue is blue"};

        // Closet cls = new Closet();
        // System.out.println(cls.anywhere(list));


        // Anagrams
        // String[] phrases = new String[] { "SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok" };

        // Aaagmnrs ana = new Aaagmnrs();
        // for (String el: ana.anagrams(phrases)) {
        //     System.out.println(el);
        // }


        // Thesaurus
        String[] entry = new String[]{"point run score","point dot","cut run tear score","cut valley","cute pretty"};

        Thesaurus ths = new Thesaurus();
        for(String el: ths.edit(entry)) {
            System.out.println(el);
        }
    }
}
