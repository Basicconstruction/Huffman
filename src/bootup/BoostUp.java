package bootup;

import huffman.GeneTranslator;
import huffman.Huffman;

import java.util.ArrayList;
import java.util.Arrays;

public class BoostUp {
    public static void main(String[] args) {
        ArrayList<Integer> huffList = new ArrayList<>();
        String[] label = new String[]{
                "0","1","2","3","4","5","6","7"
        };
        int[] arr = new int[]{25,20,15,10,10,10,5,5};
        for(int i:arr){
            huffList.add(i);
        }
        ArrayList<String> labels = new ArrayList<>(Arrays.asList(label));
        Huffman huffman = new Huffman(new GeneTranslator().getGeneList(labels,huffList));
        huffman.work();
    }
}
