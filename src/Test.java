import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Teachers> teachers = new ArrayList<>();
        Teachers t1 = new Teachers("BALMFORTH", 8);
        Teachers t2 = new Teachers("OLLIVIER", 7);
        Teachers t3 = new Teachers("ZHOU", -1);
        Teachers t4 = new Teachers("KLAASSEN", 10);
        Teachers t5 = new Teachers("DAO", 5);
        Teachers t6 = new Teachers("KERR", 1);
        Teachers t7 = new Teachers("MARCOSER", 1000);
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);
        teachers.add(t7);
        List<String> better = teachers.stream().filter(x -> x.getRating() > 0).filter(x -> x.getName().length() > 5).sorted(Teachers::compareTo).map(Teachers::getName).collect(toList());
        int forFun = teachers.stream().map(Teachers::getRating).reduce(0,Integer::sum);
        Iterator hehe = better.iterator();
        while (hehe.hasNext()) {
            System.out.println(hehe.next());
        }
        System.out.println(forFun);

        Teachers t61 = new Teachers("MARCOSER", 1000);
        Teachers t71 = new Teachers("MARCOSER", 1000);
        System.out.println(t61==t71);


        Parent marco = new Child();
        List<Integer> lol = new ArrayList<>();
        ArrayList<Integer> lol2 = (ArrayList<Integer>) lol;


        System.out.println(marco.getName());
        System.out.println(((Child) marco).f(3,4));
        System.out.println(((Child) marco).test(3));



    }

}
