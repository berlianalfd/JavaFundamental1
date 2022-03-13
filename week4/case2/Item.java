/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @modificated Berliana Elfada
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Item(String name) {
        System.out.println(this.name = new Item().name);
    }
}

