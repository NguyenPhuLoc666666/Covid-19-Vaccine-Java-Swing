package Model;

public class DanhSachTiem 
{
    private String masods;
    private String tends;
   
    
    public DanhSachTiem(){
        
    }

    public DanhSachTiem(String masods, String tends) {
        this.masods = masods;
        this.tends = tends;
    }

    public String getMasods() {
        return masods;
    }

    public void setMasods(String masods) {
        this.masods = masods;
    }

    public String getTends() {
        return tends;
    }

    public void setTends(String tends) {
        this.tends = tends;
    }

    @Override
    public String toString() {
        return "DanhSachTiem{" + "masods=" + masods + '}';
    }

}
