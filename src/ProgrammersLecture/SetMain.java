package ProgrammersLecture;

import java.util.*;

class MyData1 {
    int value;

    public MyData1(int v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData1 myData1 = (MyData1) o;
        return value == myData1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public class SetMain {
    public static void main(String[] args) {
        //HashSet<MyData> list = new HashSet<>(); // set은 순서를 보장하지 않는다.
        Set<MyData1> setA = new LinkedHashSet<>(); // set은 순서를 보장하지 않는다.
        Set<MyData1> setB = new LinkedHashSet<>(); // set은 순서를 보장하지 않는다.

        setA.add(new MyData1(1));
        setA.add(new MyData1(2));
        setA.add(new MyData1(3));

        setB.add(new MyData1(2));
        setB.add(new MyData1(3));
        setB.add(new MyData1(4));

//        setA.addAll(setB);
//        setA.removeAll(setB);
        setA.retainAll(setB);
        System.out.println(setA);
    }
}
