public class CotDiem {
   private String thongTinDanhGia;
   private String phuongPhapDanhGia;
   private String noiDungDanhGia;

   public CotDiem() {
      this.thongTinDanhGia = "N/A";
      this.phuongPhapDanhGia = "N/A";
      this.noiDungDanhGia = "N/A";
   }

   public CotDiem(String thongTinDanhGia, String phuongPhapDanhGia, String noiDungDanhGia) {
      this.thongTinDanhGia = thongTinDanhGia;
      this.phuongPhapDanhGia = phuongPhapDanhGia;
      this.noiDungDanhGia = noiDungDanhGia;
   }

   public String getNoiDungDanhGia() {
      return noiDungDanhGia;
   }

   public void setNoiDungDanhGia(String noiDungDanhGia) {
      this.noiDungDanhGia = noiDungDanhGia;
   }

   public String getThongTinDanhGia() {
      return thongTinDanhGia;
   }

   public void setThongTinDanhGia(String thongTinDanhGia) {
      this.thongTinDanhGia = thongTinDanhGia;
   }

   public String getPhuongPhapDanhGia() {
      return phuongPhapDanhGia;
   }

   public void setPhuongPhapDanhGia(String phuongPhapDanhGia) {
      this.phuongPhapDanhGia = phuongPhapDanhGia;
   }
}
