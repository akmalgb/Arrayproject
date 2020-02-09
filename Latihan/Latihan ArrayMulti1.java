package array;

public class ArrayMulti1 {

    public static void main(String[] args) {
        int nilai[][] = new int[2][3];
        nilai[0][0] = 81;
        nilai[0][1] = 79;
        nilai[0][2] = 86;
        nilai[1][0] = 85;
        nilai[1][1] = 90;
        nilai[1][2] = 78;
        String MP[] = {"RPL", "PBO"};
        int ratarataMP[] = new int[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                ratarataMP[i] += nilai[i][j];
            }
            ratarataMP[i] /= nilai[0].length;
        }
        System.out.println("Nilai Mata Pelajaran\n");
        System.out.println("MK\tMinggu 1\tMinggu 2\tMinggu 3\tRata-Rata");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("\n" + MP[i] + "\t");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print(ratarataMP[i] + "\t\t");
            }
        }
    }
}
