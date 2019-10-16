package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Warna warna = new Warna();
        Scanner scanner = new Scanner(System.in);
        
        //Memilih warna.
        System.out.println(warna.FG_MERAH + "YUK" + warna.FG_HIJAU + " CEK " + warna.FG_KUNING + "KEPRIBADIANMU" + warna.FG_CYAN + " DARI" + warna.FG_MAGENTA + " WARNA" + warna.FG_BIRU + " FAVORITMU");
        System.out.println(warna.BG_MERAH + "        MERAH           ");
        System.out.println(warna.BG_HIJAU + "        HIJAU           ");
        System.out.println(warna.BG_KUNING + "        KUNING          ");
        System.out.println(warna.BG_BIRU + "        BIRU            ");
        System.out.println(warna.BG_MAGENTA + "        UNGU            " + warna.RESET);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        warna.warnaFavorit = scanner.nextLine().toUpperCase();
        
        warna.tampilkanWarnaKepribadian(warna.warnaFavorit);
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
