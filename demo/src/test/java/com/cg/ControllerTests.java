
package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.service.IEmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

    @WebMvcTest(EmployeeController.class)
    class EmployeeControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockitoBean
        private IEmployeeService service;

        private ObjectMapper objectMapper = new ObjectMapper();
        @Test
        void testGetAllEmployees() throws Exception {
            EmployeeDTO emp = new EmployeeDTO("Sahil", LocalDate.of(2003,2,23),30000.0);
            EmployeeDTO emp1 = new EmployeeDTO("Samar", LocalDate.of(2002, 10,15),55000.0);
            EmployeeDTO emp2 = new EmployeeDTO("Jatin", LocalDate.of(1998, 10, 25), 3500.0);
            when(service.getAllEmployee()).thenReturn(List.of(emp,emp1,emp2));

            mockMvc.perform(get("/employees"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].fullName").value("Sahil"))
                    .andExpect(jsonPath("$[1].fullName").value("Samar"))
                    .andExpect(jsonPath("$[2].fullName").value("Jatin"));
        }

        @Test
        void testGetEmployeeById() throws Exception {
            EmployeeDTO emp = new EmployeeDTO("Sahil", LocalDate.of(2003,2,23),30000.0);
            emp.setEmployeeId(1001);

            when(service.getEmployee(1001)).thenReturn(emp);

            mockMvc.perform(get("/employees/1001"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.fullName").value("Sahil"))
                    .andExpect(jsonPath("$.salary").value(30000.0));
        }
        @Test
        void testGetEmployeeByName() throws Exception {
            EmployeeDTO emp = new EmployeeDTO("Sahil", LocalDate.of(2003,2,23),30000.0);
            emp.setEmployeeId(1001);

            when(service.getEmployeeByName("Sahil")).thenReturn(List.of(emp));

            mockMvc.perform(get("/employees/name/Sahil"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].fullName").value("Sahil"));
        }

        @Test
        void testCreateEmployee() throws Exception {
            EmployeeDTO emp = new EmployeeDTO("Sahil", LocalDate.of(2003,2,23),30000.0);
            emp.setEmployeeId(1001);

            when(service.createEmployee(any(EmployeeDTO.class))).thenReturn(emp);

            mockMvc.perform(post("/employees")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsString(emp)))
                    .andExpect(status().isCreated())
                    .andExpect(jsonPath("$.fullName").value("Sahil"));
        }

        @Test
        void testUpdateEmployee() throws Exception {
            EmployeeDTO emp = new EmployeeDTO("Manav", LocalDate.of(2003,2,23),30000.0);
            emp.setEmployeeId(1001);

            when(service.updateEmployee(emp)).thenReturn(emp);

            mockMvc.perform(put("/employees/update")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsString(emp)))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.fullName").value("Manav"));
        }
        @Test
        void testDeleteEmployee() throws Exception {

            mockMvc.perform(delete("/employees/delete/1001"))
                    .andExpect(status().isOk())
                    .andExpect(content().string("Deleted"));
        }
    }
