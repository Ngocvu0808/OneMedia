/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.Date;
import person.Employee;
import person.Person;


/**
 *
 * @author Admin
 */
public class Book extends Product{
    private String gener;
    private String publisher ;
    private String author;

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String gener, String publisher, String author, String id, String code, String name, long purchasePrice, long salePrice, int remaining, Date addDate, Date updateDate, Employee updater, String position) {
        super(id, code, name, purchasePrice, salePrice, remaining, addDate, updateDate, updater, position);
        this.gener = gener;
        this.publisher = publisher;
        this.author = author;
    }



    @Override
    public void display() {
        super.display();
        System.out.println("Tac gia: "+ author);
        System.out.println("The loai: "+ gener );
        System.out.println("Nha xuat ban: "+publisher);
    }

    
       
}
