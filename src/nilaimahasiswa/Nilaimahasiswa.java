/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilaimahasiswa;

/**
 *
 * @author adhary
 */
import java.util.Scanner;

class Mahasiswa{
    
    // atribut
    private String nama;
    private double nilai_absen;
    private double hitung_nilai_absen;
    private double nilai_tugas;
    private double hitung_nilai_tugas;
    private double nilai_uts;
    private double hitung_nilai_uts;
    private double nilai_uas;
    private double hitung_nilai_uas;
    private char hitung_indeks;
    private double hitung_nilai_akhir;
    
    // method nama
    public void set_nama(String nm){
       this.nama = nm;
    }
    
    public String get_nama(){
        return nama;
    }
    
    // method nilai absen
    public void set_nilai_absen(double nli_absen){
        this.nilai_absen = nli_absen;
    }
    
    public double get_nilai_absen(){
        hitung_nilai_absen = nilai_absen * 0.1;
        return hitung_nilai_absen;
    }
    
    // method nilai tugas
    public void set_nilai_tugas(double nli_tugas){
        this.nilai_tugas = nli_tugas;
    }
    
    public double get_nilai_tugas(){
        hitung_nilai_tugas = nilai_tugas * 0.2;
        return hitung_nilai_tugas;
    }
    
    // method nilai uts
    public void set_nilai_uts(double nli_uts){
        this.nilai_uts = nli_uts;
    }
    
    public double get_nilai_uts(){
        hitung_nilai_uts = nilai_uts * 0.3;
        return hitung_nilai_uts;
    }
      
    // method nilai uas
    public void set_nilai_uas(double nli_uas){
        this.nilai_uas = nli_uas ;
    }
    
    public double get_nilai_uas(){
        hitung_nilai_uas = nilai_uas * 0.4;
        return hitung_nilai_uas;
    }
    
    public double menghitung_nilai_uas(){
        return hitung_nilai_uas;
    }
    
     // method nilai akhir
    public double menghitung_nilai_akhir(){
        hitung_nilai_akhir = hitung_nilai_absen + hitung_nilai_tugas +
                hitung_nilai_uts + hitung_nilai_uas;
        
        return hitung_nilai_akhir;
    }
    
  // method indeks
  public char menghitung_indeks(){
        if (menghitung_nilai_akhir() >= 80 && menghitung_nilai_akhir() <= 100 ){
            hitung_indeks = 'A';
        }
        else if(menghitung_nilai_akhir() >= 68 && menghitung_nilai_akhir() <= 79){
            hitung_indeks = 'B';
        }
        else if(menghitung_nilai_akhir() >= 56 && menghitung_nilai_akhir() <= 67){
            hitung_indeks = 'C';
        }
        else if(menghitung_nilai_akhir() >= 45 && menghitung_nilai_akhir() <= 55){
            hitung_indeks = 'D';
        }
        else if(menghitung_nilai_akhir() >= 0 && menghitung_nilai_akhir() <= 44){
            hitung_indeks = 'E';
        }
        return hitung_indeks;
  }
}

public class Nilaimahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // pembuatan objek
        Scanner s = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();
        
        // mengisi inputan
        System.out.print("Masukkan Nama anda : ");
        m.set_nama( s.next());
        System.out.print("Masukkan Nilai absen anda = ");
        m.set_nilai_absen(s.nextDouble());
        System.out.print("Masukkan Nilai tugas anda = ");
        m.set_nilai_tugas(s.nextDouble());
        System.out.print("Masukkan Nilai UTS anda = ");
        m.set_nilai_uts(s.nextDouble());
        System.out.print("Masukkan Nilai UAS anda = ");
        m.set_nilai_uas(s.nextDouble());
        System.out.println();
        
        // menampilkan inputan
        System.out.println("Prosentase Hasil Nilai Absen =  "+ m.get_nilai_absen());
        System.out.println("Prosentase Hasil Nilai Tugas = "+ m.get_nilai_tugas());
        System.out.println("Prosentase Hasil Nilai UTS = " + m.get_nilai_uts());
        System.out.println("Prosentase Hasil Nilai UAS = " + m.get_nilai_uas());
        
        System.out.println("Mahasiswa yang bernama "+m.get_nama()+" Memperoleh Nilai Akhir = "+m.menghitung_nilai_akhir()
            + " Dan Indeks Nilai adalah : "+m.menghitung_indeks());
    }
}
