package templatePattern.antipattern;

public class Cricket {
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    public final void playCricket(){
        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
