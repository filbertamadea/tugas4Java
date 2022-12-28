package repository;

import Services.PaketService;

public class PaketRepository implements PaketService {
    @Override
    public String judul() {
       String output = "Restoran Filbert \n================ \n";
       return output;
    }
    @Override
    public String mainMenu() {
        String output = "1. Menu " +
                "\n2. Edit Pesanan" +
                "\n3. Payment" +
                "\n4. Exit" +
                "\n================";
        return output;
    }
    @Override
    public String menu() {
        String output = "1. Menu Paket " +
                "\n2. Makanan Saja" +
                "\n3. Minuman Saja" +
                "\n4. Menu Utama" +
                "\n================";
        return output;
    }
    @Override
    public String paket() {
        String output = "1. Menu Paket Ayam + Nasi = Rp. 30.000,00 " +
                "\n2. Menu Paket Bebek + Nasi = Rp. 35.000,00" +
                "\n3. Menu Paket Sapi + Nasi = Rp. 40.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String makanan() {
        String output = "1. Ayam Geprek = Rp. 15.000,00 " +
                "\n2. Bebek Goreng = Rp. 20.000,00" +
                "\n3. Tempe Goreng = Rp. 5.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String minuman() {
        String output = "1. Es Teh Manis = Rp. 5.000,00 " +
                "\n2. Es Teh Tawar = Rp. 3.000,00" +
                "\n3. Es Jeruk = Rp. 8.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String edit() {
        String output = "Action yang ingin dilakukan ?  " +
                "\n1. Tambah Pesanan ?" +
                "\n2. Edit Pesanan ?" +
                "\n3. Delete Pesanan ?" +
                "\n4. Payment ?" +
                "\n5. Kembali ?" +
                "\n================";
        return output;
    }

}
