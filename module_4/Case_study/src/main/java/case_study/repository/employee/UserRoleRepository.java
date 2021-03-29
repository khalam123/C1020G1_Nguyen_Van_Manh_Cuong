package case_study.repository.employee;

import case_study.model.employee.User;
import case_study.model.employee.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
    List<UserRole> findByUser(User user);
}
