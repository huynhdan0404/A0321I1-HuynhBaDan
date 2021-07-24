package bai_10.bai_tap.trien_khai_arraylist;

public class TestMyList {
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
        Student a = new Student(1,"Huy");
        Student b = new Student(2,"Huy");
        Student c = new Student(3,"Huy");
        Student d = new Student(4,"Huy");
        Student e = new Student(5,"Huy");
        Student f = new Student(6, "hoa");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        System.out.println(studentMyList.size());
        studentMyList.add(f,4);
        System.out.println(studentMyList.size());

        System.out.println(studentMyList.get(3).getId());

        System.out.println(studentMyList.indexOf(c));

        System.out.println(studentMyList.contais(c));

        studentMyList.remove(2);
        for (int i = 0;i < studentMyList.size();i++){
            System.out.println(studentMyList.get(i).getId());
        }
    }
}
