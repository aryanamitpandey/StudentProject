package Developer.StudentProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Developer.StudentProject.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
