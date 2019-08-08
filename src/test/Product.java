package test;
import java.time.LocalDate;
import java.util.Date;

public class Product {

    private long id;
    private String name;
    private LocalDate created;
    private double amount;

    public Product(long id, String name, LocalDate created, double amount) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.amount = amount;
    }
}