/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class cakep {
    



    // Konstanta untuk warna text
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menampilkan pertanyaan dengan warna
        System.out.print(RED + "Kamu " + 
                        GREEN + "ngerjain sendiri " + 
                        YELLOW + "latihan 17 sampe " + 
                        BLUE + "latihan 30 ini?\n" + 
                        RED + "Jawab" + RESET + 
                        " (Yoi/Enggak) : ");
        
        String jawaban = input.nextLine().toUpperCase();
        
        // Mengecek jawaban
        if (jawaban.equals("YOI")) {
            System.out.println("\n" + RED + "Cakep Bener. Good Job");
            System.out.println(GREEN + "BUILD SUCCESSFUL (total time: 8 seconds)" + RESET);
        } 
        else if (jawaban.equals("ENGGAK")) {
            System.out.println("\n" + RED + "Tetep cakep sih.");
            System.out.println(GREEN + "Sing penting paham konsep nya yee.");
            System.out.println(BLUE + "Keep the code works dude");
            System.out.println(GREEN + "BUILD SUCCESSFUL (total time: 6 seconds)" + RESET);
        }
        else {
            System.out.println("\n" + RED + "Jawaban tidak valid! Pilih Yoi atau Enggak." + RESET);
        }
        
        input.close();
    }
}
