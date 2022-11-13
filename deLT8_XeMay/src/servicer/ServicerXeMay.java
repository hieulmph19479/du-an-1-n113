/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicer;

import java.util.ArrayList;
import model.XeMay;
import repository.XeMayRepository;

/**
 *
 * @author Admin
 */
public class ServicerXeMay {
    XeMayRepository repXe;
    public ServicerXeMay(){
        repXe = new XeMayRepository();
    }
    public  ArrayList<XeMay> getList(){
        return this.repXe.getAll();
    }
    public  void update(String ma, XeMay xe){
        this.repXe.update(ma, xe);
    }
    public  void delete(String Ma){
        this.repXe.delete(Ma);
    }
    
}
