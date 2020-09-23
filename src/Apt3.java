import apt3.*;

public class Apt3 {
    public static void main(String[] args) throws Exception {
        // StringCuts
        // String[] list = new String[] {"compsci", "is", "fun", "sometimes"};
        // int minLength = 10;

        // StringCuts sc = new StringCuts();
        // for (String word: sc.filter(list, minLength)) {
        //     System.out.println(word);
        // }


        // TrueSpace
        // int[] sizes = new int[] {4096, 33792, 76800};
        // int clusterSize = 1024;

        // TrueSpace ts = new TrueSpace();
        // System.out.println(ts.calculateSpace(sizes, clusterSize));


        // CounterAttack
        // String str = "this is a test this is only a test this is a test this is only a test";
        // String[] words = new String[] {"this", "is", "a", "test" };

        // CounterAttack ca = new CounterAttack();
        // for (int count: ca.analyze(str, words)) {
        //     System.out.println(count);
        // }

        // System.out.println(ca.analyze(str, words));


        // BigWord
        // String[] sentences = new String[] {"big bad dog", "big bad toy", "big bad cat", "small bad cat"};

        // BigWord bw = new BigWord();
        // System.out.println(bw.most(sentences));


        // PrefixCode
        String[] words = new String[] {"6G9Lnpzw", "kA", "SyW9fFaF", "k", "SyW9fFa", "6G", "6", "SyW9f"};

        PrefixCode pc = new PrefixCode();
        System.out.println(pc.isOne(words));
    }
}
