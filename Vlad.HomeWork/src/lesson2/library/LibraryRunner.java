package lesson2.library;

public class LibraryRunner {
    public static void main(String[] args) {

        Library library = createLibrary();

        System.out.println("По автору ======================================================");
        System.out.println(library.getBooksByAuthor("Иван Тургенев"));
        System.out.println("По издательскому дому ==========================================");
        System.out.println(library.getBooksByPublisher("Омега"));
        System.out.println("С даты публикации ==============================================");
        System.out.println(library.getBooksFromDate("2010"));
    }

    private static Library createLibrary() {
        Library result = new Library();

        result.addBook(new Book.Builder("Муму", "Иван Тургенев").publisher("Дрофа").dateOfPublication("2010").pages(64).price(13L).typeOfBinding(TypeOfBinding.SOFT_COVER).build());
        result.addBook(new Book.Builder("Отцы и дети", "Иван Тургенев").publisher("Омега").dateOfPublication("2016").pages(304).price(99L).typeOfBinding(TypeOfBinding.HARD_COVER).build());
        result.addBook(new Book.Builder("Ревизор", "Николай Гоголь").publisher("Омега").dateOfPublication("2016").pages(176).price(96L).build());

        return result;
    }
}
