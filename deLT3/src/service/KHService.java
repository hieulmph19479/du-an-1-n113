
package service;

import java.util.ArrayList;
import kho.KHRepository;
import model.KhachHang;


public class KHService {
    private KHRepository rep;
    
    public KHService(){
        this.rep = new KHRepository();
    }
    public ArrayList<KhachHang> getList(){
       return this.rep.all();
    }
     public void insert(KhachHang kh) {
        this.rep.insert(kh);
    }
     public void update(int id, KhachHang kh){
         this.rep.update(id, kh);
     }
    public void delete(int id) {
        this.rep.delete(id);
    }
}
