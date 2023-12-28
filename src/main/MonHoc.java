import java.util.ArrayList;

public class MonHoc {
   private String ma;
   private String ten;
   private String moTa;
   private int soTinChi;
   private KhoiKienThuc khoiKienThuc = new KhoiKienThuc();

   final int LIMIT_PRE_COURSES = 3;
   final int LIMIT_REQUIRE_COURSES = 3;
   // Luu ma mon hoc
   private ArrayList<String> monHocTienQuyet = new ArrayList<>();
   private ArrayList<String> monHocTruoc = new ArrayList<>();

   public MonHoc(String id, String ten, String moTa, int soTinChi) {
      this.ma = ma;
      this.ten = ten;
      this.moTa = moTa;
      this.soTinChi = soTinChi;
   }

   public MonHoc() {
      this.ma = "N/A";
      this.ten = "N/A";
      this.moTa = "N/A";
      this.soTinChi = -1;
      this.khoiKienThuc = new KhoiKienThuc();
   }

   public String getMa() {
      return ma;
   }

   public String getTen() {
      return ten;
   }

   public String getMoTa() {
      return moTa;
   }

   public int getSoTinChi() {
      return soTinChi;
   }

   public static MonHoc inputAndCreate() {
      InputScanner scanner = new InputScanner();
      String ten = (scanner.getStringInput("Mon hoc: "));
      String ma = (scanner.getStringInput("Ma mon hoc: "));
      String moTa = (scanner.getStringInput("Mo ta: "));
      int soTinChi = (scanner.getIntInput("So tin chi: "));
      return new MonHoc(ten, ten, moTa, soTinChi);
   }

   @Override
   public String toString() {
      return "Mon hoc: " + ten + '\n'
            + "Man mon hoc: " + ma + '\n'
            + "Mo ta: " + moTa + '\n'
            + "So tin chi : " + moTa + '\n'
            + khoiKienThuc.toString();

   }

   public void themMonTienQuyet(String maMonHoc) {
      if (monHocTienQuyet.size() < LIMIT_REQUIRE_COURSES) {
         monHocTienQuyet.add(maMonHoc);
      } else {
         throw new Error("Khong the mon hoc moi. So mon hoc truoc toi da la " + LIMIT_REQUIRE_COURSES);
      }
   }

   public void themMonTruoc(String maMonHoc) {
      if (monHocTruoc.size() < LIMIT_PRE_COURSES) {
         monHocTruoc.add(maMonHoc);
      } else {
         throw new Error("Khong the mon hoc moi. So mon hoc tien quyet toi da la " + LIMIT_PRE_COURSES);
      }
   }

   public void xoaMonTienQuyet(String maMonHoc) {
      if (monHocTienQuyet.size() == 0) {
         throw new Error("Khong co san mon hoc nao de xoa");
      } else {
         monHocTienQuyet.removeIf(s -> s.equals(maMonHoc));
      }
   }

   public void xoaMonTruoc(String maMonHoc) {
      if (monHocTruoc.size() == 0) {
         throw new Error("Khong co san mon hoc nao de xoa");
      } else {
         monHocTruoc.removeIf(s -> s.equals(maMonHoc));
      }
   }

   public boolean equals(Object other) {
      if (this == other) {
         return true;
      } else {
         if (!(other instanceof MonHoc)) {
            return false;
         }
         MonHoc compareMonHoc = (MonHoc) other;
         if (compareMonHoc.getTen().equals(this.getTen()) && compareMonHoc.getMa().equals(this.getMa())) {
            return true;
         }
      }
      return false;
   }

}
