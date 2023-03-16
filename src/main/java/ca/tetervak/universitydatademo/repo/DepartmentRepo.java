package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
