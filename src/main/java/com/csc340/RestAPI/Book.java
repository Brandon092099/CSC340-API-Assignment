/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.RestAPI;

/**
 *
 * @author sentini, updated by BGeorge for API Assignment
 */
public class Book {
    private String author;
    private String content;

    public Book(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }
}
