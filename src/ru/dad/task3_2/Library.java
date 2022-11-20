package ru.dad.task3_2;
/*
ДЗ 3 Часть 2
Должен быть реализован класс Книга, содержащий название и автора.

Также должен быть реализован класс Посетитель, содержащий имя посетителя и идентификатор
(null до тех пор пока не возьмет книгу).

Должен быть реализован класс Библиотека со следующим функционалом:

Работа со списком существующих книг в библиотеке.

Сюда входят все добавленные книги, в том числе и одолженные.
Название книги считается уникальным, и в библиотеке не может быть двух книг с одинаковым
названием.

1. Добавить новую книгу в библиотеку, если книги с таким наименованием ещё нет
в библиотеке.

Если книга в настоящий момент одолжена, то считается, что она
всё равно есть в библиотеке (просто в настоящий момент недоступна).

2. Удалить книгу из библиотеки по названию, если такая книга в принципе есть в
библиотеке и она в настоящий момент не одолжена.

3. Найти и вернуть книгу по названию.

4. Найти и вернуть список книг по автору.

Механизм одалживания книги посетителю. Каждый посетитель в один момент времени
может читать только одну книгу.

5. Одолжить книгу посетителю по названию, если выполнены все условия:
    a. Она есть в библиотеке.
    b. У посетителя сейчас нет книги.
    c. Она не одолжена.

Также если посетитель в первый раз обращается за книгой — дополнительно
выдать ему идентификатор читателя.

6. Вернуть книгу в библиотеку от посетителя, который ранее одалживал книгу. Не принимать книгу от другого
посетителя.
    a. Книга перестает считаться одолженной.
    b. У посетителя не остается книги.

Тестирование.
7. В методе main написать несколько тестов на реализованный функционал.

Дополнительная задача*:
8. Добавить функционал оценивания книг посетителем при возвращении в
библиотеку. Оценка книги рассчитывается как среднее арифметическое оценок
всех посетителей, кто брал эту книгу. Реализовать метод, возвращающий
оценку книги по её наименованию.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    //список книг
    private static List<Book> bookListLibrary;
    //список посетителей
    private static List<Visitor> visitors;

    public Library() {
        visitors = new ArrayList<>(Arrays.asList(new Visitor("John"),
                new Visitor("Edward"),
                new Visitor("Donald"),
                new Visitor("Heather"),
                new Visitor("Terry"),
                new Visitor("Charles")));

        bookListLibrary = new ArrayList<>(Arrays.asList(new Book("Book1", "Author1"),
                new Book("Book2", "Author2"),
                new Book("Book3", "Author4"),
                new Book("Book4", "Author3"),
                new Book("Book5", "Author5"),
                new Book("Book6", "Author5"),
                new Book("Book7", "Author2"),
                new Book("Book8", "Author5"),
                new Book("Book9", "Author4"),
                new Book("Book10", "Author3"),
                new Book("Book11", "Author1"),
                new Book("Book12", "Author5"),
                new Book("Book13", "Author3"),
                new Book("Book14", "Author2"),
                new Book("Book15", "Author1")));
    }

    //вернуть Visitor по имени
    public Visitor getVisitorName(String name) {
        for (Visitor visitor : visitors) {
            if (visitor.getName().equals(name)) {
                return visitor;
            }
        }
        return null;
    }
    //добавить Visitor
    public void addVisitor(String name) {
        if (getVisitorName(name) == null) {
            visitors.add(new Visitor(name));
        } else {
            System.out.println("Такой пользователь уже есть");
        }
    }
    //вывести список Visitors
    public void printAllVisitors() {
        for (Visitor visitor : visitors) {
            System.out.println(visitor);
        }
    }
    //выдать книгу Visitor и присвоить id при необходимости.
    public void giveBookToVisitor(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        if (visitor.getId() == 0) {
            visitor.setId();
        }
        if (book != null) {
            if (visitor.getBooks().size() == 0 && book.isBookStatus()) {
                visitor.getBooks().add(book);
                book.setBookStatus(false);
                System.out.println("Книга " + book.getTitle() + " выдана " + visitor.getName());
            } else {
                System.out.println(visitor.getName() + " отказано в выдаче книги");
            }
        } else {
            System.out.println("Такой книги нет в библиотеке");
        }
    }
    //есть ли книга у Visitor
    private boolean visitorThisBook(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        for (Book visitorBook : visitor.getBooks()) {
            if (visitorBook.equals(book)) {
                return true;
            }
        }
        return false;
    }
    //принять книгу у Visitor
    public void returnBookOfVisitor(String nameVisitor, String title) {
        Visitor visitor = getVisitorName(nameVisitor);
        Book book = findBookTitle(title);
        if (visitorThisBook(nameVisitor, title)) {
            bookListLibrary.add(book);
            book.setRating((int) (1 + Math.random() * 10));
            book.setBookStatus(true);
            visitor.getBooks().remove(book);
            System.out.println(visitor.getName() + " вернул книгу " + book.getTitle());
        } else {
            System.out.println("Не можем принять книгу. Сдавать должен тот, кто брал !!");
        }
    }
    //уникальность книги
    private boolean isUniqueBook(String title) {
        for (Book book : bookListLibrary) {
            if (book.getTitle().equals(title)) {
                return false;
            }
        }
        return true;
    }
    //добавить книгу в библиотеку
    public void addBookLibrary(String title, String author) {
        if (isUniqueBook(title)) {
            bookListLibrary.add(new Book(title, author));
        } else {
            System.out.println("Такая книга уже есть в библиотеке");
        }
    }
    //удалить книгу из библиотеки
    public void removeBook(String title) {
        Book book = findBookTitle(title);
        if (book == null) {
            System.out.println("Такой книги нет!");
        } else if (book.isBookStatus()) {
            bookListLibrary.remove(book);
        } else {
            System.out.println("Удалить нельзя, так как книга в настоящий момент на руках.");
        }
    }
    //вывести список всех доступных книг
    public void printAllBooks() {
        for (Book book : bookListLibrary) {
            System.out.println(book);
        }
    }
    //найти и вернуть книгу по названию
    public Book findBookTitle(String title) {
        for (Book book : bookListLibrary) {
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }
    //найти и вернуть список книг по автору
    public List<Book> findAllBooksAuthor(String author) {
        List<Book> listBookAuthor = new ArrayList<>();
        for (Book book : bookListLibrary) {
            if (book.getAuthor().equals(author)) {
                listBookAuthor.add(book);
            }
        }
        return listBookAuthor;
    }
    //рейтинг книги по названию
    public double getRatingBook(String title) {
        Book book = findBookTitle(title);
        return book.getAverageRating();
    }
}