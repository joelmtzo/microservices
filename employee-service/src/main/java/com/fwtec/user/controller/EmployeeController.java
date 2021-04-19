package com.fwtec.user.controller;

import com.fwtec.user.VO.ResponseTemplateVO;
import com.fwtec.user.entity.Employee;
import com.fwtec.user.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveUser(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findByEmployeeId(@PathVariable("id") Long employeeId) {
        return employeeService.findByEmployeeId(employeeId);
    }


}
