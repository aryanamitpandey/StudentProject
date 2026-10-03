package Developer.StudentProject.Service;

import java.util.List;

import Developer.StudentProject.Entity.Department;

public interface DepartmentService {

    //This is a method to save department details
    public Department saveDepartment(Department department);

    //This is a method to fetch department details by id
    public Department findDepartmentById(Long departmentId);

    //This is a method to get all records of departments in database
    public List<Department> getAllDepartment();

    //This is a method to update department details by id
    public Department updateDepartment( Department department, Long departmentId);

    //This is a method to delete department details by id
    public void deleteDepartmentById(Long departmentId);




    
    
}
