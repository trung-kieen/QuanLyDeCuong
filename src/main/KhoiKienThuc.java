public class KhoiKienThuc {
   private String coSo;
   private String coSoNganh;
   private String chuyenNganh;

   public KhoiKienThuc() {
      this.coSo = "N/A";
      this.coSoNganh = "N/A";
      this.chuyenNganh = "N/A";
   }

   public KhoiKienThuc(String coSo, String coSoNganh, String chuyenNganh) {
      this.coSo = coSo;
      this.coSoNganh = coSoNganh;
      this.chuyenNganh = chuyenNganh;
   }

   public String getCoSo() {
      return coSo;
   }

   public void setCoSo(String coSo) {
      this.coSo = coSo;
   }

   public String getCoSoNganh() {
      return coSoNganh;
   }

   public void setCoSoNganh(String coSoNganh) {
      this.coSoNganh = coSoNganh;
   }

   public String getChuyenNganh() {
      return chuyenNganh;
   }

   public void setChuyenNganh(String chuyenNganh) {
      this.chuyenNganh = chuyenNganh;
   }

   public void inputAndCreate() {
      InputScanner scanner = new InputScanner();
      setCoSo(scanner.getStringInput("Co so: "));
      setCoSoNganh(scanner.getStringInput("Co so nganh: "));
      setChuyenNganh(scanner.getStringInput("chuyenNganh: "));
   }

   @Override
   public String toString() {
      return "Co so " + coSo + '\n'
            + "Co so " + coSoNganh + '\n'
            + "Co so " + chuyenNganh + '\n';
   }

}
