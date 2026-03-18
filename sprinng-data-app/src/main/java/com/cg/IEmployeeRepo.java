package com.cg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
    @Query("select e from Employee e where e.name=:n")
    public List<Employee> findByNa(@Param("n") String name);
//    public List<Employee> findByName(String name);

    public List<Employee> findBySalaryLessThan(double sal);

    @Query("SELECT e FROM Employee e WHERE MONTH(e.dob) =: month AND YEAR(e.dob) =:year")
    List<Employee> findByBirthMonth(@Param("month") int month,@Param("year") int year);

//    List<Employee> findByDobBetween(LocalDate start, LocalDate end);
}
