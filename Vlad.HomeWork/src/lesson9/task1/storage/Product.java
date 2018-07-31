package lesson9.task1.storage;

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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrise() {
        return prise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prise=" + prise +
                '}';
    }
}
