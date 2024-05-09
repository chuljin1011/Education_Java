package xyz.itwill.enumerate;

public class EnumExample {
    // 계절을 표현하는 enum 타입 정의
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        // enum 값 사용하기
        Season currentSeason = Season.SUMMER;
        
        // switch 문을 활용하여 각 계절에 따른 동작 수행
        switch (currentSeason) {
            case SPRING:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case SUMMER:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case AUTUMN:
                System.out.println("현재 계절은 가을입니다.");
                break;
            case WINTER:
                System.out.println("현재 계절은 겨울입니다.");
                break;
        }
    }
}