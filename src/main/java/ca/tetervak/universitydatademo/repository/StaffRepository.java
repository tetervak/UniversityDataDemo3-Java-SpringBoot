package ca.tetervak.universitydatademo.repository;

import ca.tetervak.universitydatademo.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * DataSource Management for the Staff at the University.
 *
 * Created by maryellenbowman
 */
public interface StaffRepository extends JpaRepository<Staff,Integer> {
}
