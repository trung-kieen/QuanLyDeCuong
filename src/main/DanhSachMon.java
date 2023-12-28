import java.util.ArrayList;

public class DanhSachMon {
   private ArrayList<MonHoc> danhSachMonHoc = new ArrayList<>();

   public void add(MonHoc monHoc) {
      if (!danhSachMonHoc.contains(monHoc)) {
         danhSachMonHoc.add(monHoc);
      }
   }

   public void remove(MonHoc monHoc) {
      if (!danhSachMonHoc.contains(monHoc)) {
         danhSachMonHoc.remove(monHoc);
      }
   }

   public MonHoc getByName(String ten) {
      MonHoc match = danhSachMonHoc.stream().filter(monHoc -> monHoc.getTen().equals(ten)).findFirst().orElse(null);
      return match;
   }

   public MonHoc getById(String ma) {
      MonHoc match = danhSachMonHoc.stream().filter(monHoc -> monHoc.getMa().equals(ma)).findFirst().orElse(null);
      return match;
   }

   public boolean containsId(String ma) {
      if (danhSachMonHoc.stream().filter(monHoc -> monHoc.getMa().equals(ma)).count() >= 1) {
         return true;
      }
      return false;
   }

}
