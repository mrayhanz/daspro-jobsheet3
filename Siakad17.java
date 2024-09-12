import java.util.Scanner;

class Siakad17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama,nim,kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUjian * 30/100) + (nilaiUjian * 30/100);

        System.out.println("Nama: " + nama + " Nim: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        }
}