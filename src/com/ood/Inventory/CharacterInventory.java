package com.ood.Inventory;

import com.ood.Item.ConsumableItem;
import com.ood.Item.IItem;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * heros/monsters' Inventory
 */
public class CharacterInventory implements IInventory<IItem>{
    private List<IItem> items;

    public CharacterInventory() {
        this.items = new ArrayList<>();
    }

    @Override
    public IItem consume() {
        return null;
    }

    @Override
    public void remove(IItem item) {
        items.remove(item);
    }

    @Override
    public void add(IItem item) {
        items.add(item);
    }

    @Override
    public void addParserCollection(ParseCollection pc) {
        //do Nothing
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public IItem get(int index) {
        return items.get(index);
    }

    @Override
    public void clearTrash() {
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i) instanceof ConsumableItem);
                if(((ConsumableItem)items.get(i)).getTimeOfUse()==0)
                    items.remove(i);
        }
    }
}
