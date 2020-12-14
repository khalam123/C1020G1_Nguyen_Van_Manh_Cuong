package bai9_dsa_danh_sach.thuc_hanh.simplelinkedlist;

public class Node {
    private Node next;
    private Object data;
    public Node(Object data){
        next = new Node(data);
    }

    public Object getData() {
        return data;
    }
}