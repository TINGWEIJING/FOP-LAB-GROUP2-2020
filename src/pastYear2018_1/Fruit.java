/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastYear2018_1;


public abstract class Fruit {
    private String name;
    private String type;

    public Fruit(String fruit, String type) {
        this.name = fruit;
        this.type = type;
    }
    
    public abstract double totalPrice();

    @Override
    public String toString() {
        return type + " " + name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
