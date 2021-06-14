package ecma.ai.ussdapp.repository;

import ecma.ai.ussdapp.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepository extends JpaRepository<Staff,Integer> {

    Optional<Staff> findByUserName(String username);
}
