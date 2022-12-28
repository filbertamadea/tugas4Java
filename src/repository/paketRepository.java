package repository;

import Services.paketService;

public class paketRepository implements paketService {
    @Override
    public String Judul() {
       String output = "Restoran Filbert \n================ \n";
       return output;
    }
    @Override
    public String MainMenu() {
        String output = "1. Menu " +
                "\n2. Edit Pesanan" +
                "\n3. Payment" +
                "\n4. Exit" +
                "\n================";
        return output;
    }
    @Override
    public String Menu() {
        String output = "1. Menu Paket " +
                "\n2. Makanan Saja" +
                "\n3. Minuman Saja" +
                "\n4. Menu Utama" +
                "\n================";
        return output;
    }
    @Override
    public String Paket() {
        String output = "1. Menu Paket Ayam + Nasi = Rp. 30.000,00 " +
                "\n2. Menu Paket Bebek + Nasi = Rp. 35.000,00" +
                "\n3. Menu Paket Sapi + Nasi = Rp. 40.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String Makanan() {
        String output = "1. Ayam Geprek = Rp. 15.000,00 " +
                "\n2. Bebek Goreng = Rp. 20.000,00" +
                "\n3. Tempe Goreng = Rp. 5.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String Minuman() {
        String output = "1. Es Teh Manis = Rp. 5.000,00 " +
                "\n2. Es Teh Tawar = Rp. 3.000,00" +
                "\n3. Es Jeruk = Rp. 8.000,00" +
                "\n4. Kembali" +
                "\n================";
        return output;
    }
    @Override
    public String Edit() {
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
