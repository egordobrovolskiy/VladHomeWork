package lesson2.library;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Library {
    private List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    List<Book> getBooksByAuthor(String author) {
        return books.stream().filter(x -> author.equals(x.getAuthor())).collect(Collectors.toList());
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (author.equals(book.getAuthor())) {
//                result.add(book);
//            }
//        }
//        return result;
    }

    List<Book> getBooksByPublisher(String publisher) {
        return books.stream().filter(x -> publisher.equals(x.getPublisher())).collect(Collectors.toList());
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (publisher.equals(book.getPublisher())) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
    }

    List<Book> getBooksFromDate(String year) {
        return books.stream().filter(x -> x.getDateOfPublication().isAfter(Year.parse(year))).collect(Collectors.toList());
    }
}
