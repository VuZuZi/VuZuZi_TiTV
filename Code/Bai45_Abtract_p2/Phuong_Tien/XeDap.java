package TITV_learning.Code.Bai45_Abtract_p2.Phuong_Tien;

import TITV_learning.Code.Bai45_Abtract_p2.HangSanXuat;
import TITV_learning.Code.Bai45_Abtract_p2.PhuongTienDiChuyen;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe Đạp",hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 10;
    }
}
