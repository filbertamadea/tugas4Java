package repository;

import Services.receiptService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class receiptRepository implements receiptService {
    String nama;
    int total;
    @Override
    public String Judul() {
        String Judul = "RESTORAN FILBERT JAYA";
        return Judul;
    }

    public String setNama(String nama) {
        this.nama = nama;
        return nama;
    }
    @Override
    public String Nama() {
        return nama;
    }

    @Override
    public String Date() {
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
