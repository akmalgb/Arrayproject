package TugasArray;

public class Tugas2 {

    public static void main(String[] args) {

        /* int bilangan[5] = {1,2,3,4,5,6,7,8}; kode tersebut akan error karena terdapat simbol [5] kata bilangan
           itu tidak perlu dan kita cukup mengganti nya dengan kode dibawah ini
         */
        int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8};

        // lalu kita harus memberi perintah untuk mengeluarkan data dari int []bilangan dengan kode dibawah ini
        for (int i = 0; i < bilangan.length; i++) {
            int j = bilangan[i];
            System.out.println(bilangan[i]);
            System.out.println(" ");

            //atau jika hanya ingin mengambil salah satu data dari int []bilangan cukup mengetik kode dibawah ini
            System.out.println(bilangan[0]);

            //pilih salah satu kode sout saja untuk mengambil data dari array int []bilangan    
        }

    }

}
