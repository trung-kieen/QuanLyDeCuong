public enum HeDaoTao {
   CHINH_QUY("chinh quy"),
   LIEN_THONG("lien thong");

   private String name;

   @Override
   public String toString() {
      return name;
   }

   public String option() {
      return "(" + CHINH_QUY.toString() + "|" + LIEN_THONG.toString() + ")";
   }

   public void setCode(String name) {
      this.name = name;
   }

   private HeDaoTao(String name) {
      this.name = name;
   }
}
