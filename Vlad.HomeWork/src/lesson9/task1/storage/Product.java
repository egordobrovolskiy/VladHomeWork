package lesson9.task1.storage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product implements Entity<Long> {
    private final long id;
    private String name;
    private String description;
    private long prise;

    public Product(long id, String name, String description, long prise) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prise = prise;
    }

    @Override
    public Long getId() {
        return id;
    }
}