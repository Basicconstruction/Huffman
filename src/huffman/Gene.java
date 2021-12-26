package huffman;

public class Gene {
    private Gene left;
    private Gene right;
    private int factor;
    private boolean hasChild;
    private boolean isHuffmanCodeRoot;
    private String label;
    public Gene(int factor,Gene left,Gene right){
        this.factor = factor;
        this.left = left;
        this.right = right;
        hasChild = true;
        isHuffmanCodeRoot = false;
        label = "";
    }
    public Gene(String label,int factor){
        this.factor = factor;
        hasChild = false;
        isHuffmanCodeRoot = true;
        this.label = label;
    }
    public Gene getLeft(){
        return left;
    }
    public Gene getRight(){
        return right;
    }
    public boolean hasChild(){
        return hasChild;
    }
    public int getFactor(){
        return factor;
    }
    public String toString(){
        if(label.equals("")){
            return ""+this.factor;
        }else{
            return label+"-"+this.factor;
        }
    }
    public String getLabel(){
        return label;
    }
    public boolean getIsHuffmanCodeRoot(){
        return isHuffmanCodeRoot;
    }
}
