
package servicer;

import java.util.ArrayList;
import kho.NVRepository;
import model.NhanVien;


public class ServicerNV {
    private NVRepository NVrep;
    
    public ServicerNV(){
        this.NVrep = new NVRepository();
    }
    public ArrayList<NhanVien> getList(){
       return this.NVrep.all();
    }
    public void insert(NhanVien nv){
        this.NVrep.insert(nv);
    }
      public void update( int id,NhanVien nv){
        this.NVrep.update(id, nv);
    }
      public void delete(int id){
          this.NVrep.delete(id);
      }
    
}
