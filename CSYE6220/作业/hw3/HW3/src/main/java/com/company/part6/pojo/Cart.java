/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.part6.pojo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public Cart(List<Item> cart) {
        this.cart = cart;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public Item getItem(String name){
        for(Item item: cart){
            if(name.equals(item.getName())){
                return item;
            }
        }
        return null;
    }
    public void addItem(Item item){
        cart.add(item);
    }
    public void deleteItem(Item item){
        cart.remove(item);
    }

    public void deleteItem(String name){
//        for(Item item: cart){
//            if(name.equals(item.getName())){
//                deleteItem(item);
//            }
//        }
        Item item = getItem(name);
        if(item!=null) deleteItem(item);
    }

    public void updateItem(String name, int amount){
        for(Item item:cart){
            if(item.getName().equals(name)){
                item.setCount(amount);
            }
        }
    }
}
