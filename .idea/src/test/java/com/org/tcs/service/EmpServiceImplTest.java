package com.org.tcs.service;

import com.org.tcs.model.Employee;
import com.org.tcs.repo.EmployeeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmpServiceImplTest {
    @InjectMocks
    private   EmpServiceImpl empServiceImp ;
    @Mock
    private EmployeeRepo employeeRepo;
    @Test
    void testCreateEmployee() {
        Employee employee=new Employee();
        employee.setId(100);
        employee.setName("Sha");
        employee.setAddress("blr");
        empServiceImp.createEmployee(employee);
        Mockito.verify(employeeRepo,Mockito.times(1)).save(employee);

    }

    @Test
    void testUpdateEmployee() {
        Employee employee =new Employee();
        employee.setId(109);
        employee.setName("shasha");
        employee.setSalary(100000000);
        empServiceImp.updateEmployee(employee);
        Mockito.verify(employeeRepo,Mockito.times(1)).save(employee);
    }

    @Test
    void testGetByIdEmployee() {
        int id=199;
        Employee employee=new Employee();
        employee.setId(133);
        employee.setName("shyam");
        employee.setAddress("Hyd");
        Optional<Employee>s=Optional.of(employee);
        Mockito.when(employeeRepo.findById(id)).thenReturn(s);
        Optional<Employee>t=empServiceImp.getByIdEmployee(id);
        Assertions.assertEquals(s,t);

    }

    @Test
    void deleteByIdEmployee() {
        Employee employee=new Employee();
        employee.setId(111);
        employee.setName("Raju");
        employee.setAddress("Blr");
        empServiceImp.updateEmployee(employee);
        Mockito.verify(employeeRepo,Mockito.times(1));
    }
}