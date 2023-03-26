/* NIM : 13020210090
   Nama : Azizah Awaliyah
   Hari/Tanggal : Minggu, 26 Maret 2023
   Waktu pengerjaan : 13.25 */

   import java.util.Scanner;
   /* Baca N, Print i = 1 s/d N dengan WHILE */
   public class PrintWhile {

      /**
      * @param args
      */
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      /* Kamus : */
      int N;
      int i;
      Scanner masukan=new Scanner(System.in);
      /* Program */

      System.out.print ("Nilai N >0 = "); /* Inisialisasi */ 
      N = masukan.nextInt();
      i = 1;   /* First Elmt */

      System.out.print ("Print i dengan WHILE: \n");
      while (i <= N) /* Kondisi pengulangan */
      { System.out.println (i); /* Proses */

      i++; /* Next Elmt */
   }; /* (i > N) */
}
}
