

    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasmi
 */

import java.util.ArrayList; 
public class Library {
    ArrayList<Book> book = new ArrayList<>();


//default constructor
public Library(){
    book = new ArrayList<>();
         book.add( new Book ("book1"));
         book.add(new Book ("book2"));
         book.add(new Book ("book3"));
         book.add(new Book ("book4"));
         book.add(new Book ("book5"));
}

//constructor with arraylist
public Library(ArrayList book){
    this.book = book;
 
}
//copy constructor
public Library(Library anotherLibrary){
    this.book = anotherLibrary.book;
}


public ArrayList<Book> searchBook(String keyword){
    ArrayList<Book> book1 = new ArrayList();
     
}


 public boolean equals(Library anotherLibrary){
    return book == anotherLibrary.book;
}

@Override
public String toString(){
    String str = "Books \n";
    for (Book book: book){
        str += book.toString() + "\n";
    }
    return String.format(str);
}

//getter
public ArrayList<Book> getBook(){
  return book;  
}

//setter
public void setBook(ArrayList book){
    this.book = book;
}

}
