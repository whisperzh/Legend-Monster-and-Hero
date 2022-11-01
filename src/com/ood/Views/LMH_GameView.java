package com.ood.Views;

import com.ood.Characters.GeneralHero;
import com.ood.Util.IConfigParser;

import javax.swing.text.html.parser.Entity;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LMH_GameView extends AbsGameView {

    @Override
    public void displayGameTitle() {
        jout("--------------WELCOME TO Legends: Monsters and Heroes-------------");
    }

    @Override
    public void displayPlayerScoreTable() {

    }

    @Override
    public void joutHelp() {

    }

    @Override
    public List<String> collectPlayersName(int size) {
        List<String> names=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            String name=jin_Str("Please enter a name for the player");

            while(name.equals(""))
            {
                displayInvalidInputMessage("You cannot input an empty name.");
                name=jin_Str("Please enter a name for the player");
            }

            names.add(name);
        }
        return names;
    }

    @Override
    public int collectPlayersCount() {
        int pc=jin_Int("Please input Player Size");
        while(pc<=0)
        {
            displayInvalidInputMessage();
            pc=jin_Int("Please input Player Size");
        }
        return pc;
    }

    @Override
    public void displayParserInfo(IConfigParser parser){
        joutDivider();
        String fileName=parser.getFileName();
        jout(fileName);
        List<List<String >> rows=new ArrayList<>();
        rows.add(parser.getOrderedSchema());


        for(var e :parser.getAttributeDataBase().keySet())
        {
            List<String> attr=parser.getAttributeDataBase().get(e);
            rows.add(attr);
        }
        joutAsTable(rows);
        joutDivider();
        jout("\n");

    }

    public void displayParserInfo(List<IConfigParser> l)
    {
        for(var i :l)
            displayParserInfo(i);
    }

    @Override
    public int collectPlayersCount(int lowerBound, int upperBound) {
        jout("Please input count of players");
        return jin_BorderedInt(lowerBound,upperBound);
    }

}
