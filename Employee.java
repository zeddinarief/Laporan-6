package LatihanProglan;
public class Employee {
    private int idKerja;
    private String nama;
    private final double gaji = 1500000;
    public String getJabatan(){
        return "";
    }
    public void setIdKerja(int id) {
        idKerja = id;
    }
    public void setNama(String nam) {
        nama = nam;
    }
    public int getIdKerja() {
        return idKerja;
    }
    public String getNama() {
        return nama;
    }
    public double getGaji() {
        return gaji;
    }
}
