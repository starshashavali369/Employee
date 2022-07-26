package com.org.tcs.controller;

import com.org.tcs.model.Employee;
import com.org.tcs.service.EmpSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
            EmpSevice empSevice;
    @PostMapping("/create")
    public  void  createEmployee(@RequestBody Employee employee){
        empSevice.createEmployee( employee);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee){
        empSevice.updateEmployee(employee);
    }
    @GetMapping("/getById/{id}")
    public Optional<Employee> getByIdEmployee(@PathVariable  Integer id){
        Optional<Employee>ss=empSevice.getByIdEmployee(id);
        return ss;
    }
    @GetMapping("/deleteById/{id}")
    public  String deleteByIdEmployee(@PathVariable Integer id){
        String rr=empSevice.deleteByIdEmployee(id);
        return rr;
    }
    }


