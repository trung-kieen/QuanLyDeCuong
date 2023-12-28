public enum HeDaoTao {
   CHINH_QUY("chinh quy"),
   LIEN_THONG("lien thong");

   private String name;

   @Override
   public String toString() {
      return name;
   }

   public static String option() {
      return "(" + CHINH_QUY.toString() + "|" + LIEN_THONG.toString() + ")";
   }

   public void setCode(String name) {
      this.name = name;
   }

   private HeDaoTao(String name) {
      this.name = name;
   }



   public static HeDaoTao getHeDaoTao() {
      while (true) {
         try {
            InputScanner scanner = new InputScanner();
            return create(scanner.getStringInput("He dao tao " + option() + ": "));
         } catch (Exception e) {
            System.out.println(e);
         }
      }
   }

   private static HeDaoTao create(String code) {
      if (code.equals(CHINH_QUY.toString())) {
         return HeDaoTao.CHINH_QUY;
      } else if (code.equals(LIEN_THONG.toString())) {
         return HeDaoTao.LIEN_THONG;

      }
      throw new Error("He dao tao khong hop le");
   }

}
