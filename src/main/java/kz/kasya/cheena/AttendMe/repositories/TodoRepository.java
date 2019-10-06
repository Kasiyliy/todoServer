package kz.kasya.cheena.AttendMe.repositories;

import kz.kasya.cheena.AttendMe.models.entities.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Assylkhan
 * on 14.09.2019
 * @project Todo
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    Page<Todo> findAll(Pageable pageable);

}
