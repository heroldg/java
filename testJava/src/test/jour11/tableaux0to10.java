package test.jour11;

public class tableaux0to10 {
    public static void main(String[] args) {

        final int TEN = 10;
        int[] ZeroToTen = new int[TEN];
        for (int i = 0; i < ZeroToTen.length; i++) {
            ZeroToTen[i] = i + 1;
            System.out.print(ZeroToTen[i]);
            System.out.println();
        }
    }
}
