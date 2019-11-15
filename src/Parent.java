public class Parent {
    private String name;
    private int x;

    public Parent (String name, int x){
        this.x = x;
        this.name = name;
    }

    public Parent(){
        this.x = 0;
        this.name = "chris";
    }

    protected String getName(){
        return this.name;
    }

    public int f(int a, int b){
        return a;
    }

    public String name(ColourVertex colourvertex){
        return colourvertex.getName();
    }

}
