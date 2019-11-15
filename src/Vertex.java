public class Vertex {
    protected String label;

    public Vertex(String label){
        this.label=label;
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Vertex)){
            return false;
        }
        boolean nte = this.label.equals(((Vertex)other).label);
        return nte;

    }
    public String getLabel(){
        return this.label;
    }
}
