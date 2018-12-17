import domain.RacingGame;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        OutputView.countOfCars();
        int countOfCars = InputView.countOfCars(sc);

        OutputView.countOfTry();
        int countOfTry = InputView.countOfTry(sc);

        RacingGame racingGame = new RacingGame();
    }
}

