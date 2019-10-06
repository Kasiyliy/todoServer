package kz.kasya.cheena.AttendMe.models.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Assylkhan
 * on 14.09.2019
 * @project Todo
 */
@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_done", nullable = false)
    private boolean done;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @PrePersist
    public void prePersist(){
        this.done = false;
        this.createdAt = new Date();
    }
}
