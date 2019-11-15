public class Teachers implements Comparable<Teachers> {

    private String name;
    private int rating;



    public Teachers (String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Teachers o) {
        return Integer.compare(o.getRating(), this.rating);
    }




}
