package org.example;

public class AppForm {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        AppForm pors = new AppForm();
        pors.name="RAM";
        pors.rollno=101;
        pors.display();

        AppForm selvi = new AppForm();
        selvi.name = "Sita";
        selvi.rollno = 102;
        selvi.display();
    }
}
