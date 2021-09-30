package ch04;

public class ForStarTest2 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2;
        System.out.println("star : " + star);

        for (int i = star; i > 0; i--) {
            for (int j = 1; j <= star; j++) {
                if(j<i){
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
