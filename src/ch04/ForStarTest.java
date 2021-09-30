package ch04;

public class ForStarTest {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2;
        System.out.println("star : " + star);

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
