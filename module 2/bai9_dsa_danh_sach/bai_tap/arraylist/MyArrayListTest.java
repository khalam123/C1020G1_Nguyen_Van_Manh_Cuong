package bai9_dsa_danh_sach.bai_tap.arraylist;

public class MyArrayListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Andrew");
        Student b = new Student(2,"Bright");
        Student c = new Student(3,"Andy");
        Student d = new Student(4,"James");
        Student e = new Student(5,"Ken");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);

        for (int i = 0; i < studentMyArrayList.size();i++){
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(studentMyArrayList.elements);
//            System.out.println(student.getName());
        }
    }
}
