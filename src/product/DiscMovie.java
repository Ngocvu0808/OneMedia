/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.Date;
import person.Employee;
/**
 *
 * @author Admin
 */
public class DiscMovie extends Product{
    private String gener;
    private int length;
    private int year;
    private String actor;
    private String director;

    public DiscMovie(String gener, int length, int year, String actor, String director, String id, String code, String name, long purchasePrice, long salePrice, int remaining, Date addDate, Date updateDate, Employee updater, String position) {
        super(id, code, name, purchasePrice, salePrice, remaining, addDate, updateDate, updater, position);
        this.gener = gener;
        this.length = length;
        this.year = year;
        this.actor = actor;
        this.director = director;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("The loai: "+gener);
        System.out.println("Thoi luong :" +length);
        System.out.println("Nam san xuat: "+ year);
        System.out.println("Dien vien: "+actor);
        System.out.println("Dao dien: "+director);
    }
    
    
    
}
