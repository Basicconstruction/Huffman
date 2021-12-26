package huffman;

import java.util.ArrayList;

public class Huffman {
    private final ArrayList<Gene> huffList;
    public Huffman(ArrayList<Gene> huffList){
        this.huffList = huffList;
    }
    public void work(){
        int circuit = this.huffList.size()-1;
        for(int k = 0;k<circuit;k++){
            printAllGene(this.huffList);
            int i = getMinGene(this.huffList);
            Gene gene1 = this.huffList.get(i);
            this.huffList.remove(i);
            int j = getMinGene(this.huffList);
            Gene gene2 = this.huffList.get(j);
            this.huffList.remove(j);
            Gene geneTemp = new Gene(gene1.getFactor()+gene2.getFactor(),gene1,gene2);
            this.huffList.add(geneTemp);
        }
        System.out.println();
        iterator(this.huffList.get(0), "");
    }
    public int getMinGene(ArrayList<Gene> geneList){
        int label = geneList.get(0).getFactor();
        int pMin = 0;
        for(int p = 0;p<geneList.size();p++){
            if(geneList.get(p).getFactor()<label){
                label = geneList.get(p).getFactor();
                pMin = p;
            }
        }
        return pMin;
    }
    public void printAllGene(ArrayList<Gene> geneList){
        System.out.println();
        geneList.forEach(e->{
            System.out.print(e+" ");
        });
    }
    public void iterator(Gene geneRoot,String rootCode){
        if(geneRoot.hasChild()){
            if(geneRoot.getLeft().getIsHuffmanCodeRoot()){
                System.out.println(geneRoot.getLeft()+": "+rootCode+"0");
            }else{
                iterator(geneRoot.getLeft(),rootCode+"0");
            }
            if(geneRoot.getRight().getIsHuffmanCodeRoot()){
                System.out.println(geneRoot.getRight()+": "+rootCode+"1");
            }else{
                iterator(geneRoot.getRight(),rootCode+"1");
            }
        }
    }
}
