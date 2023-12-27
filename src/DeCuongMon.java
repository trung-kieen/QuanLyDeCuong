import java.util.ArrayList;

public class DeCuongMon {

   private HeDaoTao heDaoTao;
   private MonHoc monHoc = new MonHoc();;
   private ArrayList<String> maMonHocTienQuyet = new ArrayList<>();
   private ArrayList<CotDiem> chuanDauRa = new ArrayList<>();
   private String giangVien;

   public DeCuongMon() {
      this.heDaoTao = HeDaoTao.CHINH_QUY;
      this.giangVien = "N/A";
   }

   public DeCuongMon(String giangVien) {
      this.heDaoTao = HeDaoTao.CHINH_QUY;
      this.giangVien = giangVien;
   }

   public void themMonHocTienQuyet(String maMonHoc) {
      final int LIMIT_PRE_COURSE = 3;
      if (maMonHocTienQuyet.size() >= LIMIT_PRE_COURSE) {
         throw new Error("Vuot qua so mon hoc tien quyet toi da la " + LIMIT_PRE_COURSE + " mon hoc");
      } else {
         maMonHocTienQuyet.add(maMonHoc);
      }
   }

}
