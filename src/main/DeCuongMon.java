import java.util.ArrayList;

public class DeCuongMon {

  private HeDaoTao heDaoTao;
  private String maMonHoc;

  private ArrayList<CotDiem> chuanDauRa = new ArrayList<>();
  final int MAX_RATE_COLUMN = 4;
  final int MIN_RATE_COLUMN = 2;

  private String maGiangVien;

  public DeCuongMon() {
    this.maGiangVien = "N/A";
    this.maMonHoc = "N/A";
  }

  public String getMaMonHoc() {
    return maMonHoc;
  }


  public DeCuongMon(String maGiangVien, String maMonHoc, HeDaoTao heDaoTao) {
    this.maGiangVien = maGiangVien;
    this.maMonHoc = maMonHoc;
    this.heDaoTao = heDaoTao;
  }

  public void setMaMonHoc(String maMonHoc) {
    this.maMonHoc = maMonHoc;
  }

  // // NOTE: This not create new
  // public void implement() {
  // // User input he dao tao
  // // User input ma mon hoc
  // // Check if not collision
  // // Create new he dao tao
  // heDaoTao = HeDaoTao.getHeDaoTao();
  // themCotDanhGia();
  // if(maxMonHoc.equals("N/A")){
  // }
  // // TODO: setMaMonHoc neu nhu ma nay hop le
  // }

  public void themCotDanhGia() {
    if (chuanDauRa.size() > MAX_RATE_COLUMN) {
      return;
    }
    chuanDauRa.add(CotDiem.inputAndCreate());

    if (chuanDauRa.size() < MIN_RATE_COLUMN) {
      themCotDanhGia();
    }
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    } else {
      if (!(other instanceof DeCuongMon)) {
        return false;
      }
      DeCuongMon compareDeCuongMon = (DeCuongMon) other;
      if (compareDeCuongMon.maMonHoc.equals(this.maMonHoc) && compareDeCuongMon.heDaoTao == this.heDaoTao) {
        return true;
      }
    }
    return false;
  }

}
