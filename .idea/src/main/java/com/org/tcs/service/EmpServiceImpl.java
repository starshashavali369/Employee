package com.org.tcs.service;

import com.org.tcs.model.Employee;
import com.org.tcs.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements  EmpSevice {
    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public void createEmployee(Employee employee) {
       employeeRepo.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
     employeeRepo.save(employee);
    }

    @Override
    public Optional<Employee> getByIdEmployee(Integer id) {
        Optional<Employee>rr=employeeRepo.findById(id);
        return rr;
    }

    @Override
    public String deleteByIdEmployee(Integer id) {
        employeeRepo.deleteById(id);
        return "success";
    }
}
