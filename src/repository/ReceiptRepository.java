package repository;

import Services.ReceiptService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptRepository implements ReceiptService {
    String nama;
    int total;
    @Override
    public String judul() {
        String Judul = "RESTORAN FILBERT JAYA";
        return Judul;
    }

    public String setNama(String nama) {
        this.nama = nama;
        return nama;
    }
    @Override
    public String nama() {
        return nama;
    }

    @Override
    public String date() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMMM yyyy. HH:mm:ss");
        String dateTimeFormatted = localDateTime.format(formatter);
        return dateTimeFormatted;
    }

    @Override
    public Integer setTotal(Integer total) {
        this.total = total;
        return total;
    }
}
