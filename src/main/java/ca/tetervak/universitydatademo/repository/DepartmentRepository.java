package ca.tetervak.universitydatademo.repository;

import ca.tetervak.universitydatademo.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DataSource Management for the Departments at the University.
 *
 * Created by maryellenbowman
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
