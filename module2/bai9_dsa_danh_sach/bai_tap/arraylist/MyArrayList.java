package bai9_dsa_danh_sach.bai_tap.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    // so luong phan tu co  trong MyArrayList
    private int size = 0;
    //Suc chua cua MyArrayList
    private static final int DEFAULT_CAPACITY = 10;
    // Mang nay dung de chua cac phan tu
    public Object[] elements;
    // Suc chua khoi tao bang constructor ko co tham so
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }
    //Phuong thuc constructor vs suc chua dc truyen vao

    public MyArrayList(int capacity){
        if(capacity >= 0)
            elements = new Object[capacity];
        else
            throw new IllegalArgumentException("capacity: " + capacity);
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for(int i = 0; i<elements.length ; i++){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size + 1; i >= index; i++){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    // Phuong thuc tang kich thuoc cua MyArrayList
    public void ensureCapacity(int minCapaacity) {
        if (minCapaacity >= 0) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapaacity);
        }
    }
//
//    public void add(E e){
//        if(size == elements.length)
//            ensureCapa();
//        elements[size++] = e;
//    }
//
//    public E remove(int index){
//        E e = (E) elements[index];
////        for( int i = index; i < size -1 ;i++)
//
//        return  e;
//    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
