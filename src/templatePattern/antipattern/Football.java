package templatePattern.antipattern;

public class Football {

    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    public final void playFootball(){
        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
