package in.athenaeum.sbdemo.apis;

import in.athenaeum.sbdemo.models.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    @GetMapping
    public Book getBook(@RequestParam(required = false) String title) {
        return new Book(0, title, "10th International", 2021, 1200);
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable int id) {
        return new Book(id, "Learning Java", "10th International", 2020, 1200);
    }
}
