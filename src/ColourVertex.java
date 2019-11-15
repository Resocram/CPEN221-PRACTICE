public class ColourVertex extends Vertex {
    private String colour;


    public ColourVertex(String label, String colour) {
        super(label);
        this.colour = colour;
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof ColourVertex)){
            return false;
        }
        return (super.equals(other) && this.colour.equals(((ColourVertex)other).colour));
    }

    public String getName(){
        return this.label;
    }
}
