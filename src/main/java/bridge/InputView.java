package bridge;

import camp.nextstep.edu.missionutils.Console;

import java.util.function.IntPredicate;
import java.util.regex.Pattern;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String value = "";
        int bridgeSize = 0;
        while (true) {
            value = readValue();
            if (isBridgeSizeNumber(value)) {
                bridgeSize = toInts(value);
                break;
            }
        }
        return bridgeSize;
    }

    public int toInts(String value) {
        int size = Integer.parseInt(value);
        return size;
    }

    public boolean isBridgeSizeNumber(String value) {
        final String REGEX = "^[3-9]{1}$|^[1]{1}[0-9]{1}$|^2{1}[0]{1}$";
        if (!Pattern.matches(REGEX, value)) {
            ErrorMessage.inputBridgeNumber();
            return false;
        }
        return true;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String moving = "";
        while (true) {
            moving = readValue();
            if (moving.equals("U") || moving.equals("D")) {
                break;
            }
            ErrorMessage.inputMoveBridgeError();
        }
        return moving;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    public String readValue() {
        String value = Console.readLine();
        return value;
    }

}
