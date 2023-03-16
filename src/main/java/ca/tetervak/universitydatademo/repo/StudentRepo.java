package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
