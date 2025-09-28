package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int pos;

    private static final IllegalArgumentException nameError
            = new IllegalArgumentException("이름은 5자 이하여야 합니다.");

    private static boolean isNameValid(String s) {
        return (s.length() <= 5);
    }

    /**
     * 이름을 사용하여 생성합니다.
     * 위치는 0으로 초기화됩니다.
     *
     * @param name 이름 (5자 이하)
     * @throws IllegalArgumentException 만약 이름이 5자를 초과한다면 오류가 발생합니다.
     */
    public Car(String name) throws IllegalArgumentException {
        if(isNameValid(name)) {
            this.name = name;
            this.pos = 0;
        } else {
            throw nameError;
        }
    }

    /**
     * 자동차의 이름을 반환합니다.
     *
     * @return 자동차의 이름
     */
    public String getName() {
        return this.name;
    }

    /**
     * 자동차의 현재 위치를 반환합니다.
     *
     * @return 자동차의 현재 위치
     */
    public int getPos() {
        return this.pos;
    }

    /**
     * 자동차를 일정한 확률에 따라 이동합니다.
     */
    public void run() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if(randomNumber >= 4) {
            this.pos++;
        }
    }

}