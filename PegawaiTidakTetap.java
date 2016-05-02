package LatihanProglan;
public class PegawaiTidakTetap extends Employee {
    private int jamKerja;
    public void setJamKerja(int jam){
        jamKerja = jam;
    }    
    public String getJabatan(){
        return "Pegawai Tidak Tetap";
    }
    @Override
    public double getGaji(){
        int gajiLembur;
        if(this.jamKerja >= 10){
            gajiLembur = 10000*this.jamKerja;
        }
        else {
            gajiLembur = 0;
        }
        return super.getGaji()+gajiLembur;
    }
}
