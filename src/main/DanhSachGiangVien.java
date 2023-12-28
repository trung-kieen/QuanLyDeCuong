import java.util.HashMap;
import java.util.Map;

public class DanhSachGiangVien {
   private HashMap<Integer, String> danhSachGiangVien = new HashMap<>();

   private static int counterId = 0;

   public void add(int ma, String ten) {
      danhSachGiangVien.put(ma, ten);
      counterId++;
   }

   public void add(String ten) {
      danhSachGiangVien.put(counterId, ten);
      counterId++;
   }

   public int getId(String ten) {

      for (Map.Entry<Integer, String> giangVien : danhSachGiangVien.entrySet()) {
         if (giangVien.getValue().contains(ten))
            return giangVien.getKey();
      }
      return -1;
   }

}
