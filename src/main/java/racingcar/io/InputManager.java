package racingcar.io;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class InputManager {
    /**
     * 차의 목록을 입력받은 후, 반환합니다.
     *
     * @return 차 목록
     * @throws IllegalArgumentException 이름이 5자를 초과할 경우 발생합니다.
     */
    public static List<Car> getCarListFromInput() throws IllegalArgumentException {
        String input;

        System.out.println("경주할 자동차의 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        input = Console.readLine();

        List<Car> carList = new ArrayList<>();

        for(String name : input.split(",")) {
            carList.add(new Car(name));
        }

        return carList;
    }

    /**
     * 시도 횟수를 입력받아 반환합니다.
     *
     * @return 시도 횟수
     * @throws IllegalArgumentException 숫자를 입력받지 못한 경우 발생합니다.
     */
    public static int getAttemptNumberFromInput() throws IllegalArgumentException {
        String input;

        System.out.println("시도할 회수는 몇 회인가요?");
        input = Console.readLine();

        int N;
        try {
            N = Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }

        return N;
    }
}