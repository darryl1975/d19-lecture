package sg.edu.nus.sg.d19lecture.repo;

import java.util.Map;
import java.util.stream.Collectors;

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
    
    public Employee getRecord(String id) {
        Employee e = hOps.get(hashRef, id);
        return e;
    }

    public Map<String, Employee> getAll() {

        Map<String, Employee> mapList = hOps.entries(hashRef);
        //mapList.values().stream().collect(Collectors.toList());

        return mapList;
    }

}
