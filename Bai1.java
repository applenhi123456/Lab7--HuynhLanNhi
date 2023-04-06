public class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }
}

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public String getTenHangSanXuat() {
        return hangSanXuat.getTenHangSanXuat();
    }

    public abstract void batDau();

    public abstract void tangToc();

    public abstract void dungLai();

    public abstract double layVanToc();
}

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    private double vanToc;

    public MayBay(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("May bay dang cat canh...");
    }

    public void haCanh() {
        System.out.println("May bay dang ha canh...");
    }

    public void batDau() {
        System.out.println("May bay dang bat dau chuyen bay...");
    }

    public void tangToc() {
        System.out.println("May bay dang tang toc...");
    }

    public void dungLai() {
        System.out.println("May bay dang dung lai...");
    }

    public double layVanToc() {
        return vanToc;
    }
}
public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    private double vanToc;

    public XeOto(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void batDau() {
        System.out.println("Xe oto dang bat dau chuyen di...");
    }

    public void tangToc() {
        System.out.println("Xe oto dang tang toc...");
    }
    public void dungLai() {
        System.out.println("Xe oto dang dung lai...");
    }
    public double layVanToc() {
        return vanToc;
    }
}
public class XeDap extends PhuongTienDiChuyen {
    private double vanToc;
    
public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
    super(loaiPhuongTien, hangSanXuat);
}

public void batDau() {
    System.out.println("Xe dap dang bat dau chuyen di...");
}

public void tangToc() {
    System.out.println("Xe dap dang tang toc...");
    vanToc += 2;
}

public void dungLai() {
    System.out.println("Xe dap dang dung lai...");
    vanToc = 0;
}

public double layVanToc() {
    return vanToc;
}
}
