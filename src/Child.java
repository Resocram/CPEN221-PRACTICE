public class Child extends Parent {


    @Override
    public int f(int a, int b){
        return b;
    }
    public int test(int b){
        return b;
    }

    public String name(Vertex colourvertex){
        return colourvertex.getLabel();
    }

}
