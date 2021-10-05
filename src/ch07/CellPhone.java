package ch07;
//부모 클래스
public class CellPhone extends Object{
    String model;
    String color;

    public CellPhone(){
        this("노트10", "white");
    }
    public CellPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void printInfo() {
        System.out.printf("model : %s, color : %s, ", model, color);
    }

    void sendMsg(String msg){
        System.out.println("보낸 메시지 :" + msg);
    }
}
/* 중요!
   은닉화, 캡슐화
   멤버필드에 숨겨져 있음(값을 바로 넣을 수 없음)

   객체에 은닉화된 멤버필드에
   값을 넣을 수 있는 방법 딱 2가지
   1. setter 메소드 이용해서 객체에 값을 넣었음
   2. 생성자를 이용해서 객체에 값을 넣었음

   객체에 은닉화된 멤버필드에
   값을 빼내는 방법 딱 1가지
   1. getter 메소드이용해서 값을 빼낸다.
 */
