package in.athenaeum.sbdemo.apis;

import in.athenaeum.sbdemo.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    private final Logger logger;

    public BookApi() {
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @GetMapping
    public ResponseEntity<Book> getBook(@RequestParam(required = false) String title) {
        logger.info("getBook: invoked with GET method and the title: {}", title);
        return ResponseEntity.ok(new Book(0, title, "10th International", 2021, 1200));
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return ResponseEntity.ok(new Book(id, "Learning Java", "10th International", 2020, 1200));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(book);
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable int id) {
        return ResponseEntity.ok(book);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Book> updateBook1(@RequestBody Book book, @PathVariable int id) {
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return ResponseEntity.noContent().build();
//        return ResponseEntity.ok().build();
//        return ResponseEntity.status(204).build();
    }
}
