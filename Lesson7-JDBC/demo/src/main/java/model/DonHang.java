package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DonHang {
    private String id;
    private String nguoiLap;
    private LocalDate ngayLap;
    private String note;
    public DonHang(){}
    public DonHang(String id, String nguoiLap, LocalDate ngayLap, String note) {
        this.id = id;
        this.nguoiLap = nguoiLap;
        this.ngayLap = ngayLap;
        this.note = note;
    }
    @Id 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNguoiLap() {
        return nguoiLap;
    }
    public void setNguoiLap(String nguoiLap) {
        this.nguoiLap = nguoiLap;
    }
    public LocalDate getNgayLap() {
        return ngayLap;
    }
    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    };
    
}
