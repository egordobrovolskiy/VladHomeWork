package lesson2.library;

import java.time.Year;

public class Book {
    private final String bookName;
    private final String author;
    private final String publisher;
    private final Year dateOfPublication;
    private final Integer pages;
    private final Long price;
    private final TypeOfBinding typeOfBinding;

    // Pattern Builder like Joshua J. Bloch "Effective Java"
    static class Builder {
        private final String bookName;
        private final String author;
        //Optional
        private String publisher = "Рукопись";
        private Year dateOfPublication = Year.parse("1970");
        private Integer pages = 0;
        private Long price = 0L;
        private TypeOfBinding typeOfBinding = TypeOfBinding.DIGITAL;

        Builder(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }

        Builder publisher(String val) {
            publisher = val;
            return this;
        }

        Builder dateOfPublication(String val) {
            dateOfPublication = Year.parse(val);
            return this;
        }

        Builder pages(Integer val) {
            pages = val;
            return this;
        }

        Builder price(Long val) {
            price = val;
            return this;
        }

        Builder typeOfBinding(TypeOfBinding val) {
            typeOfBinding = val;
            return this;
        }

        Book build() {
            return new Book(this);
        }
    }

        private Book (Builder builder) {
            bookName = builder.bookName;
            author = builder.author;
            publisher = builder.publisher;
            dateOfPublication = builder.dateOfPublication;
            pages = builder.pages;
            price = builder.price;
            typeOfBinding = builder.typeOfBinding;
        }

    public String getBookName() {
        return bookName;
    }

    String getAuthor() {
        return author;
    }

    String getPublisher() {
        return publisher;
    }

    Year getDateOfPublication() {
        return dateOfPublication;
    }

    public Integer getPages() {
        return pages;
    }

    public Long getPrice() {
        return price;
    }

    public TypeOfBinding getTypeOfBinding() {
        return typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                ", pages=" + pages +
                ", price=" + price +
                ", typeOfBinding=" + typeOfBinding +
                '}' + "\n";
    }
}
