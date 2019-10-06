package kz.kasya.cheena.AttendMe.controllers.rest;

import kz.kasya.cheena.AttendMe.controllers.BaseController;
import kz.kasya.cheena.AttendMe.models.entities.Todo;
import kz.kasya.cheena.AttendMe.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Assylkhan
 * on 14.09.2019
 * @project Todo
 */
@RestController
@RequestMapping("/api/todos")
@CrossOrigin("*")
public class TodoController extends BaseController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public ResponseEntity<?> index() {
        return buildResponse(todoRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Todo> todoOpt = todoRepository.findById(id);
        if (todoOpt.isPresent()) {
            return buildResponse(todoOpt.get(), HttpStatus.OK);
        }
        return buildResponse(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/page")
    public ResponseEntity<?> getById(@RequestParam Optional<Integer> page) {
        Sort sort = Sort.by(Sort.Order.desc("id"));
        PageRequest pageRequest = PageRequest.of(page.orElse(0),3,sort );
        return buildResponse(todoRepository.findAll(pageRequest), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Todo todo) {
        if (todo.getId() != null) {
            return buildResponse(HttpStatus.BAD_REQUEST);
        }
        todoRepository.save(todo);
        return buildResponse(todo, HttpStatus.CREATED);
    }


    @RequestMapping(value = "{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Todo todo) {
        Optional<Todo> todoOpt = todoRepository.findById(id);

        if (todo.getId() == null || !todo.getId().equals(id) || !todoOpt.isPresent()) {
            return buildResponse(HttpStatus.BAD_REQUEST);
        }
        return buildResponse(todoRepository.save(todo), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return buildResponse(HttpStatus.OK);
    }
}
