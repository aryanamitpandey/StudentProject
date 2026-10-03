package Developer.StudentProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Developer.StudentProject.Entity.Department;
import Developer.StudentProject.Service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private final Developer.StudentProject.Service.DepartmentServiceImp departmentServiceImp;
    @Autowired 
    private DepartmentService departmeentService;

    DepartmentController(Developer.StudentProject.Service.DepartmentServiceImp departmentServiceImp) {
        this.departmentServiceImp = departmentServiceImp;
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmeentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department findDepartmentById(@RequestParam Long departmentId){
        return departmeentService.findDepartmentById(departmentId);
    }
    @GetMapping("/departments/all")
    public List<Department> getAllDepartment(){
        return departmeentService.getAllDepartment();
    }

    @PutMapping("/depatment/update/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId){
        return departmeentService.updateDepartment(department, departmentId);
    
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmeentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }

    
}
