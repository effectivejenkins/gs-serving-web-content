package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user/new")
    public User AddNewUser(@RequestParam(value="name", required=false, defaultValue="John") String name) {
        return new User(counter.incrementAndGet(), name);
    }
}
