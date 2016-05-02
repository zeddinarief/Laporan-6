package LatihanProglan;
public class PegawaiTetap extends Employee {
    private boolean statusIstri;
    private int jumlahAnak;
    private int lamaKerja;
    private double tunjangan;
    public void setStatusIstri(boolean Istri) {
        statusIstri = Istri;
    }
    public void setJumlahAnak(int Anak) {
        jumlahAnak = Anak;
    }
    @Override
    public String getJabatan(){
        return "Pegawai Tetap";
    }
    public boolean StatusIstri() {
        return statusIstri;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setlamaKerja(int tahunMasuk) {
        lamaKerja = 2015 - tahunMasuk;
    }
    public double getBonus() {
        if (this.lamaKerja > 10) {
            return 0.1 * lamaKerja;
        } else if (lamaKerja > 5 && lamaKerja <= 10) {
            tunjangan = 0.05 * lamaKerja;
            return 0.05 * lamaKerja;
        } else {
            return 0;
        }
    }
    public double getTunjangan() {
        double totalGaji = super.getGaji() + getBonus() + tunjangan;
        if (StatusIstri()) {
            tunjangan += (0.1 * totalGaji);
        } else {
            tunjangan += 0;
        }
        if (getJumlahAnak() > 0) {
            if (getJumlahAnak() <= 3) {
                tunjangan += getJumlahAnak() * 0.15 * totalGaji;
            } else {
                tunjangan += 3 * 0.15 * totalGaji;
            }
        } else {
            tunjangan += 0;
        }
        return tunjangan;
    }
    @Override
    public double getGaji() {
        return super.getGaji() + getBonus() + getTunjangan();
    }
}
