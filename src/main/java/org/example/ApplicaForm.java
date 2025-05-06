package org.example;

public class ApplicaForm {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValue(String s, int n){
        name = s;
        rollno = n;
    }
}
class ALternateClass{
    public static void main(String[] args) {
        ApplicaForm pors = new ApplicaForm();
        pors.name = "Laksh";
        pors.rollno = 103;
        pors.display();

        ApplicaForm sel = new ApplicaForm();
        sel.setValue("Hanu", 104);
        sel.display();
    }
}