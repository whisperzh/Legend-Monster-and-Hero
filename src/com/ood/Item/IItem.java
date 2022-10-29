package com.ood.Item;

import com.ood.Players.IPlayer;

/**
 * interface of Item
 */
public interface IItem {
    int getPrice();
    int getLevel();
    String getName();
    void setName(String name);
    void setPrice(int price);
    void setLevel(int level);

}
