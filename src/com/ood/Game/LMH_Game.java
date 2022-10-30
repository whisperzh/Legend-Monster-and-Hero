package com.ood.Game;

import com.ood.Enums.GameEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Judge.IGameJudge;
import com.ood.Players.LMH_Player;
import com.ood.Team.Team;
import com.ood.Views.AbsGameView;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame<LMH_Player>{

    private AbsGameView view;

    private final GameEnum type=GameEnum.LMH;

    private int teamSize=4;




    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //set team size of this specific game here
        getTeamCollection().addTeam(new Team<LMH_Player>("Player Team",teamSize));
        //getTeamCollection().addTeam(new Team<ComputerPLayer>("Monster Team"));

    }

    @Override
    public void initConfiguration() {

    }

    /**
     * do Nothing for LMH_Game
     */
    @Override
    public void initPlayers() {
        //no players Here

    }

    @Override
    public void setView(AbsGameView view) {
        this.view=view;
    }


    @Override
    public AbsGameView getView() {
        return view;
    }


    @Override
    public void start() {
        while (true)
        {

            break;
        }
        getView().displayerPlayerScoreTable();
    }

    public GameEnum getType() {
        return type;
    }
}
