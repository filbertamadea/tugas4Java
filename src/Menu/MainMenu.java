package Menu;

import Model.Item;
import Services.kasirService;
import Services.receiptService;
import repository.ItemRepository;
import repository.receiptRepository;

import java.util.Scanner;

public class MainMenu {
    private static kasirService<Item, Integer> kasirService = new ItemRepository();
    private static receiptService  receipt = new receiptRepository();
    private static Scanner sc = new Scanner(System.in);
    public static void MainMenu() {

        System.out.println("Restoran Filbert");
        System.out.println("================");
        System.out.println("1. Menu");
        System.out.println("2. Edit Pesanan");
        System.out.println("3. Payment");
        System.out.println("4. Exit");
        System.out.println("================");
        System.out.println("Jawab = ");
        String input = sc.nextLine();
        if (input.equals("1")) {
            Menu();
        } else if (input.equals("2")) {
            Edit();
        } else if (input.equals("3")) {
            Payment();
        } else if (input.equals("4")) {
            System.out.println("Terimakasih =)");
            System.exit(0);
        } else {
            System.out.println("Menu yang anda pilih tidak tepat");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            MainMenu();
        }
    }
    public static void Menu() {

        System.out.println("Restoran Filbert");
        System.out.println("================");
        System.out.println("1. Menu Paket");
        System.out.println("2. Makanan Saja");
        System.out.println("3. Minuman Saja");
        System.out.println("4. Menu Utama");
        System.out.println("================");
        System.out.println("Jawab = ");
        String input = sc.nextLine();
        if (input.equals("1")) {
            Paket();
        } else if (input.equals("2")) {
            Makanan();
        } else if (input.equals("3")) {
            Minuman();
        } else if (input.equals("4")) {
            MainMenu();
        } else {
            System.out.println("Menu yang anda pilih tidak tepat");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            Menu();
        }
    }
    public static void Paket() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String Menu = null;
        String iyah = null;
        int total = 0;
        do {
            System.out.println("Restoran Filbert");
            System.out.println("================");
            System.out.println("1. Menu Paket Ayam + Nasi = Rp. 30.000,00");
            System.out.println("2. Menu Paket Bebek + Nasi = Rp. 35.000,00");
            System.out.println("3. Menu Paket Sapi + Nasi = Rp. 40.000,00");
            System.out.println("4. Kembali");
            System.out.println("================");
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                Menu = "Menu Paket Ayam + Nasi = Rp. 30.000,00";
                harga = "Rp 30.000,00";
                total = 30000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(2);
                Menu = "Menu Paket Bebek + Nasi = Rp. 35.000,00";
                harga = "Rp 35.000,00";
                total = 35000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(3);
                Menu = "Menu Paket Sapi + Nasi = Rp. 40.000,00";
                harga = "Rp 40.000,00";
                total = 40000;
            } else if (input.equals("4")) {
                Menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                Paket();
            }
            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + Menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah Paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, Menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Paket();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Paket();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        } while (iyah.equals("iya"));
        Menu();
    }
    public static void Makanan() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String Menu = null;
        String iyah = null;
        int total = 0;

        do {
            System.out.println("Restoran Filbert");
            System.out.println("================");
            System.out.println("1. Ayam Geprek = Rp. 15.000,00");
            System.out.println("2. Bebek Goreng = Rp. 20.000,00");
            System.out.println("3. Tempe Goreng = Rp. 5.000,00");
            System.out.println("4. Kembali");
            System.out.println("================");
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                Menu = "Ayam Geprek = Rp. 15.000,00";
                harga = "Rp 15.000,00";
                total = 15000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(2);
                Menu = "Bebek Goreng = Rp. 20.000,00";
                harga = "Rp 20.000,00";
                total = 20000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(3);
                Menu = "Tempe Goreng = Rp. 5.000,00";
                harga = "Rp 5.000,00";
                total = 5000;
            } else if (input.equals("4")) {
                Menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                Paket();
            }

            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + Menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah Paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, Menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Makanan();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Makanan();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        } while (iyah.equals("iya"));
        Menu();
    }
    public static void Minuman() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String Menu = null;
        String iyah = null;
        int total = 0;

        do {
            System.out.println("Restoran Filbert");
            System.out.println("================");
            System.out.println("1. Es Teh Manis = Rp. 5.000,00");
            System.out.println("2. Es Teh Tawar = Rp. 3.000,00");
            System.out.println("3. Es Jeruk = Rp. 8.000,00");
            System.out.println("4. Kembali");
            System.out.println("================");
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                Menu = "Es Teh Manis = Rp. 5.000,00";
                harga = "Rp 5.000,00";
                total = 5000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(1);
                Menu = "Es Teh Tawar = Rp. 3.000,00";
                harga = "Rp 3.000,00";
                total = 3000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(1);
                Menu = " Es Jeruk = Rp. 8.000,00";
                harga = "Rp 8.000,00";
                total = 8000;
            } else if (input.equals("4")) {
                Menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                Minuman();
            }
            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + Menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah Paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, Menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Minuman();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Minuman();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        }while (iyah.equals("iya"));
        Menu();
    }
    public static void Show(){
        for (int i = 0; i <= kasirService.index() ; i++){
            System.out.println(kasirService.findById(i));
        }
    }
    public static void Edit(){
        if (kasirService.size() > 0 ){
            System.out.println("====LIST PESANAN====");
            Show();
            System.out.println("====================");
            System.out.println("Action yang ingin dilakukan ? ");
            System.out.println("1. Tambah Pesanan ? ");
            System.out.println("2. Edit Pesanan ? ");
            System.out.println("3. Delete Pesanan ? ");
            System.out.println("4. Payment ? ");
            System.out.println("5. Kembali ? ");
            System.out.println("Jawab = [1,2,3,4,5] ");
            String input = sc.nextLine();

            if(input.equals("1")){
                Menu();
            } else if (input.equals("2")) {
                EditPesanan();
            } else if (input.equals("3")) {
                DeletePesanan();
            } else if (input.equals("4")) {
                Payment();
            } else if (input.equals("5")) {
                MainMenu();
            } else {
                System.out.println("Inputan Anda Salah! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Edit();
            }
        } else {
            System.out.println("Anda Belum Melakukan Pemesanan, Silahkan Kembali! ");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            MainMenu();
        }

    }
    public static void EditPesanan(){
        System.out.println("====LIST PESANAN====");
        Show();
        int buatBalik = kasirService.size() + 1;
        System.out.println("[ " + "-" + " ] Kembali" );
        System.out.println("====================");
        System.out.println("Pilih pesanan yang ingin di edit / Kembali");
        String input = sc.nextLine();

        if (input.equals("-")){
            MainMenu();
        } else{
            int jumlahInput = kasirService.size() + 1;
            if( Integer.parseInt(String.valueOf(input)) < jumlahInput) {
                System.out.println("Anda akan merubah = ");
                System.out.println(kasirService.findById(Integer.parseInt(String.valueOf(input))));
                System.out.println("1. Ubah jumlah pesanan");
                System.out.println("2. Kembali");
                System.out.println("====================");
                System.out.println("Jawab = ");
                String nanya = sc.nextLine();
                //validasi ingin mengubah atau kembali
                if(nanya.equals("1")){
                    System.out.println("Berapa jumlah pesanan yang baru = ");
                    String baru = sc.nextLine();
                    //validasi inputan tidak boleh 0
                    if(Integer.parseInt(String.valueOf(baru)) > 0){
                        kasirService.update(Integer.parseInt(String.valueOf(baru)), Integer.parseInt(String.valueOf(input)));
                        System.out.print("Data sukses diubah..");
                        sc.nextLine();
                        EditPesanan();
                    } else {
                        System.out.println("Minimal angka 1! ");
                        System.out.print("Tekan [Enter] untuk kembali..");
                        sc.nextLine();
                        EditPesanan();
                    }
                } else if (input.equals("2")) {
                    EditPesanan();
                }
            } else {
                System.out.println("Data Tidak Ada! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                EditPesanan();
            }
            EditPesanan();
        }
    }
    public static void DeletePesanan() {
        System.out.println("====LIST PESANAN====");
        Show();
        int buatBalik = kasirService.size() + 1;
        System.out.println("[ " + "-" + " ] Kembali" );
        System.out.println("====================");
        System.out.println("Pilih pesanan yang ingin di Delete / Kembali");
        String input = sc.nextLine();
        if (input.equals("-")){
            MainMenu();
        } else {
            int jumlahInput = kasirService.size() + 1;
            if( Integer.parseInt(String.valueOf(input)) < jumlahInput) {
                System.out.println("Anda akan menghapus = ");
                System.out.println(kasirService.findById(Integer.parseInt(String.valueOf(input))));
                System.out.println("1. Hapus pesanan");
                System.out.println("2. Kembali");
                System.out.println("====================");
                System.out.println("Jawab = ");
                String nanya = sc.nextLine();
                //validasi ingin mengubah atau kembali
                if(nanya.equals("1")){
                    kasirService.delete(Integer.valueOf(input));
                    System.out.print("Data sukses dihapus..");
                    sc.nextLine();
                    Edit();
                } else {
                    System.out.print("Data gagal dihapus..");
                    sc.nextLine();
                    DeletePesanan();
                }
            } else {
                System.out.println("Data Tidak Ada! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                DeletePesanan();
            }
        }
    }
    public static int Hitung(){
        int sum = 0;
        for (int i = 0; i < kasirService.size(); i++){
            sum += kasirService.getBiaya(i, i);
        }
        return sum;
    }
    public static void Payment(){
        if (kasirService.size() > 0 ){
            System.out.println("Input nama customer = ");
            receipt.setNama(sc.nextLine());
            System.out.println("======================");
            System.out.println("=====List Pesanan=====");
            Show();
            System.out.println("======================");
            int jumlah = Hitung();
            System.out.println("Total Harga = Rp." + jumlah);
            double ppn = jumlah * 0.11;
            System.out.println("Total PPN = Rp." + jumlah * 0.11);
            double totalPpn = jumlah + ppn ;
            System.out.println("Total Harga setelah PPN (11%) = Rp." + totalPpn );
            System.out.print("Ingin Membayar ? [y/n]");
            String input = sc.nextLine();
            if(input.equals("y")){
                Struk();
            } else if(input.equals("n")) {
                MainMenu();
            } else {
                System.out.println("Inputan Anda Salah! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                MainMenu();
            }
            Payment();
        } else {
            System.out.println("Anda Belum Melakukan Pemesanan, Silahkan Kembali! ");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            MainMenu();
        }
    }
    public static void Struk(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(receipt.Judul());
        System.out.println("======================");
        System.out.println("Atas Nama = " + receipt.Nama());
        System.out.println("Tanggal   = " + receipt.Date());
        System.out.println("======================");
        System.out.println("=====List Pesanan=====");
        Show();
        System.out.println("======================");
        int jumlah = Hitung();
        System.out.println("Total Harga = Rp." + jumlah);
        double ppn = jumlah * 0.11;
        System.out.println("Total PPN = Rp." + jumlah * 0.11);
        double totalPpn = jumlah + ppn ;
        System.out.println("Total Harga setelah PPN (11%) = Rp." + totalPpn );
        System.out.println("Input Pembayaran");
        String bayar = sc.nextLine();
        if(Integer.valueOf(bayar) > totalPpn) {
            double kembalian = Integer.valueOf(bayar) - totalPpn;
            System.out.println("Kembalian anda = Rp. " + kembalian);
            System.out.println("Terimakasih Sudah berbelanja!");
            System.exit(0);
        } else {
            System.out.println("Uang yang anda input kurang ! Coba lagi? [y / n]");
            String input2 = sc.nextLine();
            if(input2.equals("y")){
                Struk();
            } else if (input2.equals("n")) {
                Payment();
            } else {
                System.out.println("Inputan anda salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                Payment();
            }
        }
    }
}
