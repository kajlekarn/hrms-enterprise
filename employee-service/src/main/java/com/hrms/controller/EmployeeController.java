package com.hrms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/create")
    public ResponseEntity<?> createEmployee() {
        return ResponseEntity.ok("Create employee API called!");
    }

    @GetMapping("/get/{_employeeId}")
    public ResponseEntity<?> getEmployee(@RequestParam(value = "additional-info", required = false) String _additionalInfo, @PathVariable("_employeeId") Long _employeeId) {
        return ResponseEntity.ok("Get employee API called!");
    }
}
