package game;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FakeUserInterface implements UserInterface {

    public boolean communicateWinnerWasCalled = false;
    public boolean sayByeWasCalled = false;
    private List<Move> moves = new LinkedList<>();
    public boolean chooseLanguageWasCalled = false;

    public Move humanChoice() {
      return moves.remove(0);
    }

    public void communicateWinner(GameEnd gameEnd) {
        communicateWinnerWasCalled = true;
    }

    public void sayBye() {
        sayByeWasCalled = true;
    }

    @Override
    public void chooseLanguage() {
        chooseLanguageWasCalled = true;
    }

    @Override
    public void showComputerChoice(Move choice) {
    }

    public void plays(Move ... move) {
        moves.addAll(Arrays.asList(move));
    }

    public void userWantsToExit() {
        moves.add(Move.EXIT);
    }
}
