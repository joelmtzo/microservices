package com.fwtec.user.service;

import com.fwtec.user.VO.Department;
import com.fwtec.user.VO.ResponseTemplateVO;
import com.fwtec.user.entity.Employee;
import com.fwtec.user.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseTemplateVO findByEmployeeId(Long employeeId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = employeeRepository.findByEmployeeId(employeeId);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + employee.getDepartmentId(),
                        Department.class);

        vo.setEmployee(employee);
        vo.setDepartment(department);

        return  vo;
    }
}
