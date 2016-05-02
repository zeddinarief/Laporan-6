package LatihanProglan;
public class Manager extends PegawaiTetap {
    @Override
    public String getJabatan(){
        return "Manager";
    }
    @Override
    public double getGaji(){
        double tunjanganJabatan=0.1*(super.getGaji());
        return super.getGaji()+tunjanganJabatan;
    }
}
