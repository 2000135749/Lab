package org.example;

public class Book {
    String bookname;
    String author;
    double price;
  public void  display(){
      System.out.println(bookname+" by "+author+"- $"+price);
  }
  public void setval(String b, String a, double p){
      bookname = b;
      author = a;
      price = p;
  }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.bookname = "HChalisa";
        b1.author = "TDas";
        b1.price = 100;
        b1.display();

        Book b2 = new Book();
        b2.setval("Ramayan", "Valmiki",200);
        b2.display();
    }
}
