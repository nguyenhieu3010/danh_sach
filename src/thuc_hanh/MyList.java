package thuc_hanh;

import java.util.ArrayList;
import java.util.Stack;

public class MyList {
    public Object[] container;
    public int size = 0;
    private static final int CAPACITY = 10;
    public MyList() {
        this.container = new Object[CAPACITY];
    }
    public int size() {
        return this.size;
    }



    public Object get(int index) {
        return this.container[index];
    }


    public void showAdd(Student student){
        for (Object element: container){
            if (element != null){
                System.out.println(element);
            }
        }
    }
    public void add(Object element){
        this.container[size] = element;
        size++;
    }
    public void insert(int index , Object element){
        if (index <= 0|| index >= size){
            System.out.println("index không thuộc phạm vi của mảng " );
        }
        for (int i = index; i < this.size +1 ; i++) {
            Object number = 0;
            number = element;
            element = container[i];
            container[i]=number;
        }
        size++;
    }
    public boolean remove(int index){
        if (index < 0 || index >= size) {
            return false;
        }


        for ( ; index < size - 1; index++) {
            container[index] = container[index + 1];
        }


        container[size - 1] = null;
          size--;

        return true; // Trả về true nếu xóa thành công

    }
    public boolean show() {
        for (int i = 0; i < size; i++) {
            System.out.println(this.container[i]);
        }

//    public int remove(int index){
//        for (; index < this.size -1; index++) {
//             this.container[index] = this.container[index+1];
//        }
//       this.container[size-1]=0;
//        return index;
//
//
        return false;
    }

}
