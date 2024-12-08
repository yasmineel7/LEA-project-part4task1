

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author yasmi
 */
public class Book {
    
    //variables
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;
    
    //default constructor
    public Book(){
        this.author = " ";
        this.title = " ";
        this.publisher= " ";
        this.price = 0;
        this.isbn = " ";
        
    }
    
    //constructor with title
    public Book(String title){
        this.title = toTitleCase(title);
        this.author = " ";
        this.publisher= " ";
        this.price = 0;
        this.isbn = " ";
        
    }
    
    //constructor woth all data members
    public Book(String title, String author, 
            double price, String publisher, String isbn){
        this.title = toTitleCase(title);
        this.author = toTitleCase(author);
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    
    //copy constructor 
    public Book(Book anotherBook){
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.price = anotherBook.price;
        this.publisher = anotherBook.publisher;
        this.isbn = anotherBook.isbn;
    }
    
    public int checkIsbnStatus(){
        if (isbn.length() == 13){
           return 0;
}
           if (isbn.length() == 17) 
               return 1;
            else 
                return -1;
        }   
    
    
    public static String toTitleCase(String str){
        String [] word = str.toLowerCase().split(" ");
        
        for (int i = 0; i < word.length; i ++) {
           word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
        }
       String str2 = String.join(" ", word);
       return str2;
    }
    
    @Override
    public String toString(){
        String str = String.format("%-15s: %s\n","Title", title);
        str += String.format("%-15s: %s\n","Author: ", author);
        str += String.format("%-15s: %s\n", "Price", price);
        str += String.format("%-15s: %s\n","Publisher", publisher);
        str += String.format("%-15s: %s\n","ISBN", isbn);
         return str;
    }
    
    //equals
    public boolean equals(Book anotherBook){
        return title.equals(anotherBook.title) &&
                author.equals(anotherBook.author) &&
                price == anotherBook.price &&
                publisher.equals(anotherBook.publisher) &&
                isbn.equals(anotherBook.isbn);
    }
    
    //clone
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        
    }
    
    //getter 
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getpublisher(){
        return publisher;
    }
    
    public String getIsbn(){
      return isbn;  
    }

    
    //setter
     public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    
    
}
