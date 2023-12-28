
public class CotDiem {
   private String phuongPhapDanhGia;
   private String noiDungDanhGia;
   private int trongSo;

   public CotDiem() {
      this.phuongPhapDanhGia = "N/A";
      this.noiDungDanhGia = "N/A";
      this.trongSo = -1;
   }

   public CotDiem(String phuongPhapDanhGia, String noiDungDanhGia, int trongSo) {
      this.phuongPhapDanhGia = phuongPhapDanhGia;
      this.noiDungDanhGia = noiDungDanhGia;
      this.trongSo = trongSo;
   }

   public static CotDiem inputAndCreate() {
      InputScanner scanner = new InputScanner();
      String phuongPhapDanhGia = (scanner.getStringInput("Phuong phap danh gia: "));
      String noiDungDanhGia = (scanner.getStringInput("Noi dung danh gia: "));
      int trongSo = (scanner.getIntInput("Trong so: "));
      return new CotDiem(phuongPhapDanhGia, noiDungDanhGia, trongSo);
   }
}
