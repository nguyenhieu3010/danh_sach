package thuc_hanh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        MyList myList = new MyList();
//        myList.add(34);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(7);
//        System.out.println(Arrays.toString(myList.container));
//
//        myList.insert(8,15);
//        System.out.println("sau khi chèn");
//        System.out.println(Arrays.toString(myList.container));
//
//        myList.remove(0);
//        System.out.println("sau khi xoá");
//        System.out.println(Arrays.toString(myList.container));

           MyList studentList = new MyList();

        Student student = new Student("hieu","hieu@gmai.com",7.78);
        Student student1 = new Student("sỹ","sỹ@gmai.com",9.9);
        Student student2 = new Student("nhất","hieu@gmai.com",8.3);

          studentList.add(student);
          studentList.add(student1);
          studentList.add(student2);
        System.out.println(studentList.show());

        studentList.remove(1);
        System.out.println(studentList.show());

        for (int i = 0; i < studentList.size; i++) {
          Student student3 = (Student) studentList.get(i);
          if (student3.getGpa() > 8){
              System.out.println(student3);;
          }
        }
    }

}
