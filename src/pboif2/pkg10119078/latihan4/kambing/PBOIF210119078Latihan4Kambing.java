/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan hasil penjumlahan variabel
 *
 */
package pboif2.pkg10119078.latihan4.kambing;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan4Kambing {
    
    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBOIF210119078Latihan4Kambing kambingJantan = new PBOIF210119078Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
