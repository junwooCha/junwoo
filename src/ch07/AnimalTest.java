package ch07;

public class AnimalTest {
    /* 다형성(여러가지 형태가 있는 성징)
     1. 부모타입은 자식객체 주소값 저장할 수 있다.
     (가리킬 수 있다.)
     2. 자식타입은 부모객체 주소값 저장할 수 없다.
     (가르킬 수 없다.) 바로 컴파일에러 발생.
     3. 메소드 호출은 타입이 알고 있는 것만 호출
        할 수 있고, 내용은 객체 기준이다.
     */
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        //Animal animal = new BigCat();
        //Animal animal2 = new Cat();
        //Animal animal3 = new Animal();
        //Object obj = new Animal();

        //BigCat bc = new Cat(); // BigCat은 부모를 부를수없다
        //Cat cat2 = new Animal(); // Cat은 부모를 부를수없다.

        Cat cat2 = new BigCat();
        cat2.crying();
        //cat2.sleep();

        BigCat bigCat1 = (BigCat) cat2;
        bigCat1.sleep();

        /*
        Object obj = 1; // Object는 모든걸 부를수 있다.
        Integer integer = new Integer(1);
        Float f = new Float(10.1);

         */
    }
}
