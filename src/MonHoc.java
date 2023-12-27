import java.util.ArrayList;

public class MonHoc {
   private String ma;
   private String ten;
   private String moTa;
   private int soTinChi;
   private KhoiKienThuc khoiKienThuc;

   public MonHoc(String id, String ten, String moTa) {
      this.ma = ma;
      this.ten = ten;
      this.moTa = moTa;
      this.khoiKienThuc = new KhoiKienThuc();
   }

   public MonHoc() {
      this.ma = "N/A";
      this.ten = "N/A";
      this.moTa = "N/A";
      this.khoiKienThuc = new KhoiKienThuc();
   }

   public String getMa() {
      return ma;
   }

   public void setMa(String ma) {
      this.ma = ma;
   }

   public String getTen() {
      return ten;
   }

   public void setTen(String ten) {
      this.ten = ten;
   }

   public String getMoTa() {
      return moTa;
   }

   public void setMoTa(String moTa) {
      this.moTa = moTa;
   }

   public int getSoTinChi() {
      return soTinChi;
   }

   public void setSoTinChi(int soTinChi) {
      this.soTinChi = soTinChi;
   }

   public void input() {
      InputScanner scanner = new InputScanner();
      setTen(scanner.getStringInput("Mon hoc: "));
      setMa(scanner.getStringInput("Ma mon hoc: "));
      setMoTa(scanner.getStringInput("Mo ta: "));
      setSoTinChi(scanner.getIntInput("So tin chi: "));
      khoiKienThuc.input();
   }

   @Override
   public String toString() {
      return "Mon hoc: " + ten + '\n'
            + "Man mon hoc: " + ma + '\n'
            + "Mo ta: " + moTa + '\n'
            + "So tin chi : " + moTa + '\n'
            + khoiKienThuc.toString();

   }
}
