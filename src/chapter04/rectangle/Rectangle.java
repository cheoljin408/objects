package chapter04.rectangle;

/**
 * 1. 코드 중복 문제
 * 다른 곳에서 사각형의 너비와 높이를 증가시키는 코드가 필요하면 그곳에서도 getRight, getBottom 메소드를 호출해서 set 메소드를 이용해 값을 수정
 *
 * 2. 변경에 취약한 문제
 * right, bottom 대신 length, height 로 변수명을 수정한다면,
 * getter, setter 메서드 수정 -> 이 변경은 기존의 getter, setter 메소드를 사용하는 곳에 모두 영향을 미침
 *
 * 해별 방법 -> 캡슐화 강화
 * Rectangle 내부에 너비와 높이를 조절하는 로직을 캡슐화 한다.
 * enlarge()
 */
public class Rectangle {

    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public void enlarge(int multiple) {
        right *= multiple;
        bottom *= multiple;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
