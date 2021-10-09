package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findByEmail(String email);

    @Query("SELECT s FROM Student s WHERE s.firstName = ?1 AND s.age >= ?2")
    List<Student> findByFirstNameAndAge(String firstName, int age);

    @Query(
            value = "SELECT * FROM student WHERE first_name = :firstName AND last_name = :lastName",
            nativeQuery = true
    )
    List<Student> findByFirstNameAndLastName(
            @Param("firstName")
            String firstName,
            @Param("lastName")
            String lastName
    );

    @Query("DELETE FROM Student s WHERE s.id = ?1")
    int deleteStudentById(Long id);

}
