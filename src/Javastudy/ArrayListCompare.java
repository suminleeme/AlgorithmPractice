package Javastudy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class MyDataList {
    int value;

    public MyDataList(int v) {
        this.value = v;
    }

    static MyDataList create(int v) {
        return new MyDataList(v);
    }
}

public class ArrayListCompare {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
        String[] strs = new String[5];
        boolean[] bools = new boolean[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(strs);
        System.out.println(bools);

        System.out.println(arr.length);
        arr[arr.length - 1] = 5;

        System.out.println(Arrays.toString(arr));

        // array는 객체는 아니지만 참조 변수다. 메모리상으로 연속되어 구성, array 변수엔 배열의 첫번째 주소를 저장
        // 첫 번재 위치만 알면 index로 상대적 위치를 빠르게 찾을 수 있다.

        //필요에 따라 크기가 늘어나거나 줄어드는 배열? 미리 공간확보 필요 없고, 사용하지 않는 메모리ㄹ는 잡아먹지 않는.

        // LIST
        // 장 ) 메모리 어딘가에 존재하는 데이터간의 링크 제공. 메모리상 연속되어 존재하지 않아도 되고 미리 공간 확보 필요 x, 필요에 따라 데이터가 늘어나거나 줄어든다..
        // 단 ) 첫 번째 위치로부터 index로 목표위치를 알려면 한칸 한칸 이동하며 찾아내야 한다. Array에 비해서 데이터 찾는 속도 느리다.

        // Linked List : 데이터가 링크로 연결된다. 양방향이면 Double Linked List

        // generic 타입이라 primitive 타입 저장 불가. primitive 타입의 wrapper 클래스 사용 가능. ex Int 불가. Integer (wrapper 클래스) 가능
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // 리스트에는 값이 앞에서부터 순서대로 add 되나, 중간에 값을 넣고 싶다면
        list.add(1, 5);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.contains(6)); // primitive 5로 입력하지만 사실 Integer.valueOf(5) 로 변경되어 들어감 generic으로

        // java.util 패키지 안에 들어 있음. linkedlist class
        // generic (<E>) 로 생성.

        LinkedList<MyDataList> list2 = new LinkedList<>();
        list2.add(MyDataList.create((1)));
        list2.add(MyDataList.create((2)));
        list2.add(MyDataList.create((3)));

        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());

        List<MyDataList> list3 = new Vector<>(); // 벡터형인데 리스트형으로도 표현 가능. 다형성
        // 어떤 객체를만들던지 list 인터페이스로 받ㅇ르 수 잇다 (api정의)

        list3.add(MyDataList.create((1)));
        list3.add(MyDataList.create((2)));
        list3.add(MyDataList.create((3)));

        method1(list3);

        // 링크드리스트는  양방향 리스트 (더블 링크드 리스트) 를 그대로 구현
        // arraylist는 list 를 구현하며 사이즈 조절 가능한 array다. 길이 늘어나면 array를 새로 만듦

    }

    // 매개변수를 list로 만들어 두면 vector도 받을 수 있다
    static void method1(List<MyDataList> list) {
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
