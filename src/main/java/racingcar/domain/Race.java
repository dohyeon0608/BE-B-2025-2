package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<Car> carList;

    /**
     * 새 레이스를 생성합니다.
     *
     * @param carList 레이스에 참여할 차 목록
     */
    public Race(List<Car> carList) {
        this.carList = carList;
    }

    /**
     * 레이스에 참가한 모든 차를 움직입니다.
     */
    public void runAllCars() {
        for(Car car : carList) {
            car.run();
        }
    }

    /**
     * 현재 레이스의 결과를 출력합니다.
     */
    public void printResult() {
        for(Car car : carList) {
            System.out.printf("%s : ", car.getName());
            System.out.println("-".repeat(car.getPos()));
        }
    }

    /**
     * 현재 레이스를 우승한 차를 반환합니다. 차는 여러 대일 수 있습니다.
     *
     * @return 레이스에서 우승한 차 목록
     */
    public ArrayList<Car> findWinners() {
        // 결괏값
        ArrayList<Car> result = new ArrayList<>();
        // 최대 위치값
        int maxPos = 0;
        // 찾기
        for(Car car : carList) {
            if(car.getPos() > maxPos) {
                maxPos = car.getPos();
                result.clear();
                result.add(car);
            } else if(car.getPos() == maxPos) {
                result.add(car);
            }
        }
        return result;
    }
}