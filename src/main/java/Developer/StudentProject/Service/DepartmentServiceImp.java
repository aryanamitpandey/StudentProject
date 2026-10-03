package Developer.StudentProject.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Developer.StudentProject.Entity.Department;
import Developer.StudentProject.Repository.DepartmentRepository;

@Service 
public class DepartmentServiceImp implements DepartmentService {

    @Autowired 
    private DepartmentRepository departmentRepository;

    @Override 
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override 
    public Department findDepartmentById(Long departmentId){
        return departmentRepository.findById(departmentId).orElseThrow(()->new RuntimeException("Department not found with id: " + departmentId));
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId){
        Department depDb = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDb.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(depDb);
    }

    @Override 
    public void deleteDepartmentById(Long departmentId){
        departmentRepository.deleteById(departmentId);

    
    }
    
}
