package in.athenaeum.sbdemo.apis;

import in.athenaeum.sbdemo.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    @GetMapping
    public Book getBook() {
        return new Book("Learning Java", "10th International", 2020, 1200);
    }
}
