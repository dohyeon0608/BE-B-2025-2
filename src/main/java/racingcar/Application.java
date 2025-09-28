package racingcar;

import racingcar.domain.Car;
import racingcar.domain.Race;
import java.util.ArrayList;
import java.util.List;

import static racingcar.io.InputManager.*;

public class Application {

    public static void main(String[] args) {
        // 입력부
        List<Car> carList = getCarListFromInput();
        int N = getAttemptNumberFromInput();
        System.out.println();

        // 실행부
        Race race = new Race(carList);

        System.out.println("실행 결과");
        for(int i = 0; i < N; i++) {
            race.runAllCars();
            race.printResult();
            System.out.println();
        }

        // 출력부
        ArrayList<Car> winners = race.findWinners();
        System.out.print("최종 우승자 : ");
        for(int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if(i != winners.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}