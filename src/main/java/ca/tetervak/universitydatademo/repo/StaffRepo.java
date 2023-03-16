package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Integer> {
}
