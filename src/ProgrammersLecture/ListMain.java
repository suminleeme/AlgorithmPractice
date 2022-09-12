package ProgrammersLecture;

import java.util.*;

class Mydata {
    int value;

    public Mydata(int v) {
    }

    static Mydata create(int v) {
        return new Mydata(v);
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydata mydata = (Mydata) o;
        return value == mydata.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public class ListMain {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        LinkedList<Mydata> list = new LinkedList<>();

        List<Mydata> list1 = new Vector<>(); //벡터형 타입인데 리스트형 타입으로 표현 가능
        List<Mydata> list = new ArrayList<>(); //벡터형 타입인데 리스트형 타입으로 표현 가능
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1,4);
//        list.remove(2);

//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//
        list.add(Mydata.create(2));
        list.add(Mydata.create(3));
//
//        System.out.println(list.contains(Integer.valueOf(1)));
//        System.out.println(list.contains(Mydata.create(2)));

        method1(list);
    }

    static void method1(List<Mydata> list) {
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
