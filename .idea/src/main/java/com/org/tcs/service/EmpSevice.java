package com.org.tcs.service;

import com.org.tcs.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface EmpSevice {
    public  void  createEmployee( Employee employee);
    public void updateEmployee(Employee employee);
    public Optional<Employee> getByIdEmployee(Integer id);
    public  String deleteByIdEmployee(Integer id);
}
