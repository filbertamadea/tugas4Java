package Model;

public class Item {
    String pilihanUser, harga, jumlah;
    int idPesanan, total;

    // konstruktor
    public void setItem(int kode, String pilihan, String harga, String jumlah, int total){
        this.idPesanan = kode;
        this.pilihanUser = pilihan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public void setJumlah(String jumlah){
        this.jumlah = jumlah;
    }

    public int getKode(){
        return idPesanan;
    }
    public String getPilihanUser(){
        return pilihanUser;
    }
    public String getHarga(){
        return harga;
    }
    public String getJumlah(){
        return jumlah;
    }
    public int getTotal(Integer data){
        int i = total * Integer.parseInt(jumlah);
        return i;
    }

    @Override
    public String toString() {
        int hargaTotal = total * Integer.parseInt(jumlah);
        String mataUang = String.format(String.valueOf(hargaTotal)).replaceAll(",",".")+",00";
        String output = "[ " + this.idPesanan + " ] "  + this.pilihanUser + ", harga = Rp. " + mataUang + ", dengan jumlah pesanan = " + this.jumlah + "\n" ;
        return output;
    }
}
