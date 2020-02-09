package array;

public class ArrayMulti2 {

    public static void main(String[] args) {
        int[][][] nilai = {
            {{95, 89}, {73, 83}, {75, 65}},
            {{66, 76}, {91, 84}, {90, 86}},
            {{59, 63}, {56, 77}, {80, 85}}
        };
        for (int i = 0; i < nilai.length; i++) {

            for (int j = 0; j < nilai[0].length; j++) {

                for (int k = 0; k < nilai.length; k++) {
                    System.out.println("nilai [" +i+ "][" +j+ "][" +k+ "] = " + nilai[i][j][k] + "\t"  );
                }
            }
        }
    }
}
