package be.intecbrussel.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MessageController {

    private final MessageRepository repo;

    public MessageController(MessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public Collection<Message> getMessages() {
        return repo.findAll();
    }

    @PostMapping("/")
    public Message createMessage(@RequestBody Message message) {
        return repo.save(message);

    }

}
