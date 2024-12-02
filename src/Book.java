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
    private double isbn;
    
    //default constructor
    public Book(){
        
    }
    
    //constructor with title
    public Book(String title){
        this.title = title;
        
    }
    
    //constructor woth all data members
    public Book(String title, String author, 
            double price, String publisher, double isbn){
        this.title = title;
        this.author = author;
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
    
    public void checkIsbnStatus(){
        if (isbn.length() = 13){
           System.out.println("0");
            if (isbn.length() = 17) 
                System.out.println("1");
            else 
                System.out.println("-1");
        }   
    }
    
    public String toTitleCase(String str){
           return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase(); 
    }
    
    public String toSting(){
        String str = String.format("%-15s:%s/n","Title", title);
        str += String.format("%-15s:%s/n","Author: ", author);
        str += String.format("%-15s: %s", "Price", price);
        str += String.format("%-15s:5s/n","Publisher", publisher);
        str += String.format("%15s:%s","Isbn", isbn);
         return str;
    }
    
    //equals
    public boolean equals(Book anotherBook){
        return title.equals(anotherBook.title) &&
                author.equals(anotherBook.author) &&
                price == anotherBook.price &&
                publisher.equals(anotherBook.publisher) &&
                isbn == anotherBook.isbn;
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
    
    public double getIsbn(){
      return isbn;  
    }

    
    //setter
     public void setTitle(){
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
    
    public void setIsbn(double isbn){
        this.isbn = isbn;
    }

    
    
}
