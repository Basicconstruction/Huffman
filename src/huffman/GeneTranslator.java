package huffman;

import java.util.ArrayList;

public class GeneTranslator {
    public GeneTranslator(){
    }
    public ArrayList<Gene> getGeneList(ArrayList<String> labelList,ArrayList<Integer> intList){
        ArrayList<Gene> geneList = new ArrayList<>(intList.size());
        for(int i = 0;i<labelList.size();i++){
            geneList.add(new Gene(labelList.get(i),intList.get(i)));
        }
        return geneList;
    }
}
