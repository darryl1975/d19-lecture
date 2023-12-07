package sg.edu.nus.sg.d19lecture.repo;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;
import sg.edu.nus.sg.d19lecture.model.Employee;

@Repository
public class EmployeeRepo {
    
    private String hashRef = "employees";

    @Resource(name="redisEmployeeTemplate")
    private HashOperations<String, String, Employee> hOps;

    // if you are using ListOperations to acces redis data in a list
    // private ListOperations<String, Employee> lOps;

    public void saveRecord(Employee e) {
        hOps.put(hashRef, e.getEmployeeId().toString(), e);
    }
    
    public Employee getRecord(Integer id) {
        Employee e = hOps.get(hashRef, String.valueOf(id));
        return e;
    }

}
