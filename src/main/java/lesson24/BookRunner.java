package lesson24;

import lesson24.csv.CsvMapper;
import lesson24.dto.AuthorDto;
import lesson24.dto.BookDto;
import lesson24.jdbc.BookDB;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;

public class BookRunner {

    public static void main(String[] args)  {
        System.out.println("Сперва удалим таблицы авторов, если таковые имеются");
        BookDB.dropBooksAndAuthorsIfExists();
        System.out.println("Создадим таблицы книг и их авторов");
        BookDB.createBooksAndAuthors();
        System.out.println("Наполним таблицы данными из ресурсного файла");
        CsvMapper.getBookInfo().stream().map(authorAndBook -> Pair.of(
                new AuthorDto(authorAndBook.getAuthor()),
                new BookDto(authorAndBook.getIsbn(),
                        authorAndBook.getTitle(),
                        authorAndBook.getUrl(),
                        authorAndBook.getPageCount(),
                        authorAndBook.getAuthor(),
                        authorAndBook.getPrice()))).forEach(pair->
                {
                    final Optional<Integer> author = BookDB.insertAuthor(pair.getLeft());
                    BookDB.insertBook(author.orElse(null), pair.getRight());
                }
                );
        System.out.println("Выполнение программы завершено");
        }
    }

