package service;

import java.util.ArrayList;
import kho.SVRepository;
import model.sinhVien;

public class ServiceSV {

    private SVRepository rep;

    public ServiceSV() {
        this.rep = new SVRepository();
    }

    public void insert(sinhVien sv) {

        this.rep.insert(sv);
    }

    public void update(int masv, sinhVien sv) {

        this.rep.update(masv, sv);
    }

    public void delete(int masv) {

        this.rep.delete(masv);
    }

    public ArrayList<sinhVien> getList() {
        return this.rep.all();
    }

}
