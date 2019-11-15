import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args){


        Vertex v1 = new Vertex("a");
        ColourVertex v2 = new ColourVertex("a", "red");
        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v1));

        ArrayList<Integer> lol = new ArrayList<>();
        lol.add(1);
        Integer result = lol.get(0);
        System.out.println(result);
        lol.set(0,2);
        System.out.println(result);

        Parent marco = new Child();
        System.out.println(marco.name(v2));
        Child child = new Child();
        Parent parent = new Parent();
        List<Child> test = new ArrayList<>();
        System.out.println(wtf(test));

        List<? super Parent> insane = new ArrayList<>();
        insane.add(child);
        insane.add(parent);


        System.out.println(((Child) (insane.get(0))).getName());
        System.out.println(insane.get(1));



    }

    public static int wtf (List<? extends Parent> list){
        return 1;
    }

    public static int insane (List<? super Parent> list){
        return 2;
    }
}
