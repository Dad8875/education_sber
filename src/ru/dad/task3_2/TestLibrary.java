package ru.dad.task3_2;
/*
1. Добавить новую книгу в библиотеку, если книги с таким наименованием ещё нет
в библиотеке.

Если книга в настоящий момент одолжена, то считается, что она
всё равно есть в библиотеке (просто в настоящий момент недоступна).

2. Удалить книгу из библиотеки по названию, если такая книга в принципе есть в
библиотеке и она в настоящий момент не одолжена.

3. Найти и вернуть книгу по названию.

4. Найти и вернуть список книг по автору.

5. Одолжить книгу посетителю по названию, если выполнены все условия:
    a. Она есть в библиотеке.
    b. У посетителя сейчас нет книги.
    c. Она не одолжена.

6. Вернуть книгу в библиотеку от посетителя, который ранее одалживал книгу. Не принимать книгу от другого
посетителя.
    a. Книга перестает считаться одолженной.
    b. У посетителя не остается книги.
*/
public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // 1. Добавить новую книгу в библиотеку
        library.addBookLibrary("title1", "testAuthor");

        // 2. Удалить книгу из библиотеки по названию
//        library.removeBook("title1");

        // 3. Найти и вернуть книгу по названию
        System.out.println(library.findBookTitle("Book5").toString());

        // 4. Найти и вернуть список книг по автору
        System.out.println(library.findAllBooksAuthor("Author3").toString());

        // 5. Одолжить книгу посетителю по названию
        library.giveBookToVisitor("Terry", "title1");
        library.giveBookToVisitor("Terry", "title1");

        // 6. Вернуть книгу в библиотеку от посетителя, который ранее одалживал книгу
        library.returnBookOfVisitor("Terry", "title1");

        // 7. Реализовать метод, возвращающий оценку книги по её наименованию.
        System.out.println(library.getRatingBook("title1"));
    }
}
