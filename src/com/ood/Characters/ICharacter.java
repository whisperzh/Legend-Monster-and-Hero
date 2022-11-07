package com.ood.Characters;

import com.ood.FunctionInterfaces.IGridContent;
import com.ood.AttributesItems.Vector2;

import java.util.Map;

public interface ICharacter extends IGridContent {
    String getName();
    void setName(String name);
    int getLevel();
    void setLevel(int level);
    void levelUp();
    float getHP();
    void setHP(float HP);
    float getDamageVal();
    void refillHP();
    float getDefense();
    void setDefense(float defense);
    float getStrength();
    void setStrength(int strength);
    String getIcon();
    void setIcon(String icon);
    void move(int row, int col);
    Vector2 getCurrentPosition();
    void addExperience(float exp);
    void recover();
    boolean isAlive();
    float takeDamage(float damage);
    Map<String, String> getAllAttribute();
    float physicalAttack(ICharacter character);
    void use(int input);


}
