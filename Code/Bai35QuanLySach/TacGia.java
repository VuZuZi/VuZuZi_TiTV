package TITV_learning.Code.Bai35QuanLySach;

public class TacGia {
    private String name;
    private Date date;

    public TacGia(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
