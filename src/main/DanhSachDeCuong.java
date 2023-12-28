import java.util.ArrayList;

public class DanhSachDeCuong {
   private ArrayList<DeCuongMon> danhSachDeCuong = new ArrayList<>();

   public void add(DeCuongMon deCuongMon) {
      // TODO:

   }

   public boolean containSubjectId(String maMonHoc) {
      return danhSachDeCuong.stream().anyMatch(deCuong -> deCuong.getMaMonHoc().equals(maMonHoc));
   }

   public int amountTrainingSystems(String maMonHoc) {
      return Math
            .toIntExact(danhSachDeCuong.stream().filter(deCuong -> deCuong.getMaMonHoc().equals(maMonHoc)).count());

   }

   public void inputAndCreate(DeCuongMon deCuongMon) {
      // TODO:
   }

   public void edit(DeCuongMon deCuongMon) {
      // TODO:
   }

   public void edit(String maMon, HeDaoTao heDaoTao) {
      // TODO:
   }

}
