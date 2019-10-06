package kz.kasya.cheena.AttendMe.repositories;

import kz.kasya.cheena.AttendMe.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    List<Role> findAllByDeletedAtIsNull();
}
