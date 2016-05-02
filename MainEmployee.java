package LatihanProglan;
import java.util.Scanner;
public class MainEmployee {
    private Employee karyawan[] = new Employee[16];
    private Scanner in = new Scanner(System.in);
    private void menuPT(int count, int idKerja, String nama) {
        PegawaiTetap tetap = new PegawaiTetap();
        tetap.setIdKerja(idKerja);
        tetap.setNama(nama);
        System.out.print("Masukkan status perkawinan (kawin/belum) : ");
        tetap.setStatusIstri(in.next().equalsIgnoreCase("kawin"));
        System.out.print("Masukkan jumlah anak : ");
        tetap.setJumlahAnak(in.nextInt());
        System.out.print("Masukkan tahun masuk kerja : ");
        tetap.setlamaKerja(in.nextInt());
        karyawan[count] = tetap;
    }
    private void menuPTT(int count, int id, String nama) {
        PegawaiTidakTetap tidak = new PegawaiTidakTetap();
        tidak.setIdKerja(id);
        tidak.setNama(nama);
        System.out.print("Masukkan jam kerja : ");
        tidak.setJamKerja(in.nextInt());
        karyawan[count] = tidak;
    }
    private void menuManager(int count, int id, String nama) {
        PegawaiTetap man = new Manager();
        man.setIdKerja(id);
        man.setNama(nama);
        System.out.print("Masukkan status perkawinan (kawin/belum) : ");
        man.setStatusIstri(in.next().equalsIgnoreCase("kawin"));
        System.out.print("Masukkan jumlah anak : ");
        man.setJumlahAnak(in.nextInt());
        System.out.print("Masukkan tahun masuk kerja : ");
        man.setlamaKerja(in.nextInt());
        karyawan[count] = man;
    }
    public static void main(String[] args) {
        MainEmployee a = new MainEmployee();
        for (int i = 0; i < a.karyawan.length; i++) {
            System.out.print("Masukkan ID Kerja : ");
            int idKerja = a.in.nextInt();
            System.out.print("Masukkan nama pegawai : ");
            String nama = a.in.next();
            System.out.println("1. Manager");
            System.out.println("2. Pegawai tetap");
            System.out.println("3. Pegawai Tidak Tetap");
            System.out.print("Masukkan jabatan (1-3) : ");
            switch (a.in.nextInt()) {
                case 1: {
                    a.menuManager(i, idKerja, nama);
                    break;
                }
                case 2: {
                    a.menuPT(i, idKerja, nama);
                    break;
                }
                case 3: {
                    a.menuPTT(i, idKerja, nama);
                    break;
                }
                default: {
                    System.out.print("Masukan salah");
                    break;
                }
            }
        }
            System.out.println("ID\tNama\tJabatan\tGaji");
        for (Employee karya : a.karyawan) {
            System.out.println(karya.getIdKerja() + "\t" + karya.getNama() + "\t" + karya.getJabatan()+"\tRp."+karya.getGaji());
        }
    }
}
