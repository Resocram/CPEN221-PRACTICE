import java.util.Comparator;

public class DurationCompare implements Comparator<Duration> {
    @Override
    public int compare(Duration o1, Duration o2) {
        if(o1.y>o2.y){
            return 1;
        } else if (o1.y<o2.y) {
            return -1;
        }
        else{
            return 0;
        }
    }

}
