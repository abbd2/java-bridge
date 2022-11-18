package bridge;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */

public class BridgeGame {

    private int tryCount = 1;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String moving, int randomNumber) { // 이동할 칸과 랜덤 값을 받음
        // U == 1, D == 0일 때 성공
        if((moving.equals("U") && randomNumber == 1) || (moving.equals("D") && randomNumber == 0)){
            System.out.println("성공");
            return true;
        }
        System.out.println("실패");
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry(String retry) {
        if(retry.equals("R")){
            tryCount++; // 시도 횟수 증가
            return true;
        }else if(retry.equals("Q")){

            return false;
        }
        return false;
    }

}
