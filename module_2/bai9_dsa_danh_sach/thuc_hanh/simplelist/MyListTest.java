package bai9_dsa_danh_sach.thuc_hanh.simplelist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("elements 3: "+listInteger.get(3));
        System.out.println("elements 1: "+listInteger.get(1));
        System.out.println("elements 2: "+listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));

    }
}
