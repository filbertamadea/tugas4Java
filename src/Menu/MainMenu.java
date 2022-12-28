package menu;

import Model.Item;
import Services.KasirService;
import Services.PaketService;
import Services.ReceiptService;
import repository.ItemRepository;
import repository.PaketRepository;
import repository.ReceiptRepository;

import java.util.Scanner;

public class MainMenu {
    private static KasirService<Item, Integer> kasirService = new ItemRepository();
    private static ReceiptService receipt = new ReceiptRepository();
    private static PaketService paket = new PaketRepository();
    private static Scanner sc = new Scanner(System.in);
    public static void mainMenu() {
        System.out.println(paket.judul());
        System.out.println(paket.mainMenu());
        System.out.println("Jawab = ");
        String input = sc.nextLine();
        if (input.equals("1")) {
            menu();
        } else if (input.equals("2")) {
            edit();
        } else if (input.equals("3")) {
            payment();
        } else if (input.equals("4")) {
            System.out.println("Terimakasih =)");
            System.exit(0);
        } else {
            System.out.println("menu yang anda pilih tidak tepat");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            mainMenu();
        }
    }
    public static void menu() {
        System.out.println(paket.judul());
        System.out.println(paket.menu());
        System.out.println("Jawab = ");
        String input = sc.nextLine();
        if (input.equals("1")) {
            paket();
        } else if (input.equals("2")) {
            makanan();
        } else if (input.equals("3")) {
            minuman();
        } else if (input.equals("4")) {
            mainMenu();
        } else {
            System.out.println("menu yang anda pilih tidak tepat");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            menu();
        }
    }
    public static void paket() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String menu = null;
        String iyah = null;
        int total = 0;
        do {
            System.out.println(paket.judul());
            System.out.println(paket.paket());
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                menu = "menu paket Ayam + Nasi = Rp. 30.000,00";
                harga = "Rp 30.000,00";
                total = 30000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(2);
                menu = "menu paket Bebek + Nasi = Rp. 35.000,00";
                harga = "Rp 35.000,00";
                total = 35000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(3);
                menu = "menu paket Sapi + Nasi = Rp. 40.000,00";
                harga = "Rp 40.000,00";
                total = 40000;
            } else if (input.equals("4")) {
                menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                paket();
            }
            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                paket();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                paket();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        } while (iyah.equals("iya"));
        menu();
    }
    public static void makanan() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String menu = null;
        String iyah = null;
        int total = 0;

        do {
            System.out.println(paket.judul());
            System.out.println(paket.makanan());
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                menu = "Ayam Geprek = Rp. 15.000,00";
                harga = "Rp 15.000,00";
                total = 15000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(2);
                menu = "Bebek Goreng = Rp. 20.000,00";
                harga = "Rp 20.000,00";
                total = 20000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(3);
                menu = "Tempe Goreng = Rp. 5.000,00";
                harga = "Rp 5.000,00";
                total = 5000;
            } else if (input.equals("4")) {
                menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                paket();
            }

            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                makanan();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                makanan();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        } while (iyah.equals("iya"));
        menu();
    }
    public static void minuman() {
        String pilihan = String.valueOf(0);
        String harga = null;
        String menu = null;
        String iyah = null;
        int total = 0;

        do {
            System.out.println(paket.judul());
            System.out.println(paket.minuman());
            System.out.println("Jawab = ");
            String input = sc.nextLine();
            if (input.equals("1")){
                pilihan = String.valueOf(1);
                menu = "Es Teh Manis = Rp. 5.000,00";
                harga = "Rp 5.000,00";
                total = 5000;
            } else if (input.equals("2")) {
                pilihan = String.valueOf(1);
                menu = "Es Teh Tawar = Rp. 3.000,00";
                harga = "Rp 3.000,00";
                total = 3000;
            } else if (input.equals("3")) {
                pilihan = String.valueOf(1);
                menu = " Es Jeruk = Rp. 8.000,00";
                harga = "Rp 8.000,00";
                total = 8000;
            } else if (input.equals("4")) {
                menu();
            } else {
                System.out.print("Inputan Salah..");
                sc.nextLine();
                minuman();
            }
            System.out.println("Anda Ingin Menambah Pilihan " + pilihan + " dengan menu = " + menu + " ? [iya / tidak]");
            String nanya = sc.nextLine();
            if (nanya.equals("iya")) {
                System.out.println("Jumlah paket " + pilihan + " yang ingin dipesan = ");
                String jml = sc.nextLine();
                int id = kasirService.index() + 1;
                Item item = new Item();
                item.setItem(id, menu, harga, jml, total);
                kasirService.save(item);
                System.out.println("Sukses Menambah Item");
            } else if (nanya.equals("tidak")) {
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                minuman();
            } else {
                System.out.println("Input Anda Salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                minuman();
            }
            System.out.println("Anda Ingin Menambah Pesanan ?");
            iyah = sc.nextLine();
        }while (iyah.equals("iya"));
        menu();
    }
    public static void show(){
        for (int i = 0; i <= kasirService.index() ; i++){
            System.out.println(" [ " + i + " ] " + kasirService.findById(i));
        }
    }
    public static void edit(){
        if (kasirService.size() > 0 ){
            System.out.println(paket.judul());
            System.out.println("====LIST PESANAN====");
            show();
            System.out.println("====================");
            System.out.println(paket.edit());
            System.out.println("Jawab = [1,2,3,4,5] ");
            String input = sc.nextLine();

            if(input.equals("1")){
                menu();
            } else if (input.equals("2")) {
                editPesanan();
            } else if (input.equals("3")) {
                deletePesanan();
            } else if (input.equals("4")) {
                payment();
            } else if (input.equals("5")) {
                mainMenu();
            } else {
                System.out.println("Inputan Anda Salah! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                edit();
            }
        } else {
            System.out.println("Anda Belum Melakukan Pemesanan, Silahkan Kembali! ");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            mainMenu();
        }

    }
    public static void editPesanan(){
        System.out.println("====LIST PESANAN====");
        show();
        int buatBalik = kasirService.size() + 1;
        System.out.println("[ " + "-" + " ] Kembali" );
        System.out.println("====================");
        System.out.println("Pilih pesanan yang ingin di edit / Kembali");
        String input = sc.nextLine();

        if (input.equals("-")){
            mainMenu();
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
                        editPesanan();
                    } else {
                        System.out.println("Minimal angka 1! ");
                        System.out.print("Tekan [Enter] untuk kembali..");
                        sc.nextLine();
                        editPesanan();
                    }
                } else if (input.equals("2")) {
                    editPesanan();
                }
            } else {
                System.out.println("Data Tidak Ada! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                editPesanan();
            }
            editPesanan();
        }
    }
    public static void deletePesanan() {
        System.out.println("====LIST PESANAN====");
        show();
        int buatBalik = kasirService.size() + 1;
        System.out.println("[ " + "-" + " ] Kembali" );
        System.out.println("====================");
        System.out.println("Pilih pesanan yang ingin di Delete / Kembali");
        String input = sc.nextLine();
        if (input.equals("-")){
            mainMenu();
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
                    edit();
                } else {
                    System.out.print("Data gagal dihapus..");
                    sc.nextLine();
                    deletePesanan();
                }
            } else {
                System.out.println("Data Tidak Ada! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                deletePesanan();
            }
        }
    }
    public static int hitung(){
        int sum = 0;
        for (int i = 0; i < kasirService.size(); i++){
            sum += kasirService.getBiaya(i, i);
        }
        return sum;
    }
    public static void payment(){
        if (kasirService.size() > 0 ){
            System.out.println("Input nama customer = ");
            receipt.setNama(sc.nextLine());
            System.out.println("======================");
            System.out.println("=====List Pesanan=====");
            show();
            System.out.println("======================");
            int jumlah = hitung();
            System.out.println("Total Harga = Rp." + jumlah);
            double ppn = jumlah * 0.11;
            System.out.println("Total PPN = Rp." + jumlah * 0.11);
            double totalPpn = jumlah + ppn ;
            System.out.println("Total Harga setelah PPN (11%) = Rp." + totalPpn );
            System.out.print("Ingin Membayar ? [y/n]");
            String input = sc.nextLine();
            if(input.equals("y")){
                struk();
            } else if(input.equals("n")) {
                mainMenu();
            } else {
                System.out.println("Inputan Anda Salah! ");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                mainMenu();
            }
            payment();
        } else {
            System.out.println("Anda Belum Melakukan Pemesanan, Silahkan Kembali! ");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            mainMenu();
        }
    }
    public static void struk(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(receipt.judul());
        System.out.println("======================");
        System.out.println("Atas nama = " + receipt.nama());
        System.out.println("Tanggal   = " + receipt.date());
        System.out.println("======================");
        System.out.println("=====List Pesanan=====");
        show();
        System.out.println("======================");
        int jumlah = hitung();
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
                struk();
            } else if (input2.equals("n")) {
                payment();
            } else {
                System.out.println("Inputan anda salah");
                System.out.print("Tekan [Enter] untuk kembali..");
                sc.nextLine();
                payment();
            }
        }
    }
}
