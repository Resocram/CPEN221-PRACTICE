import java.util.Comparator;

public class Duration implements Comparator<Duration> {
    public final int x;
    public final int y;
    //rep invariant:
    // min>=0, secs>=0

    //abstraction function
    // AF(r) = a time, such that
    // l.minutes = x
    // l.seconds = y

    public Duration(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getLength() {
        return x * 60 + y;
    }

    public String toString() {
        return "" + this.x + "" + this.y;
    }

    @Override
    public int compare(Duration o1, Duration o2) {
        if(o1.x>o1.y){
            return 1;
        } else if (o1.x<o1.y) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
