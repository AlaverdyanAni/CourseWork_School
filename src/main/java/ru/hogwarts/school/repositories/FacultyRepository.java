package ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {

 List <Faculty> findFacultiesByColour(String colour);
 Faculty findFacultyByNameIgnoreCase (String name);
 Faculty findFacultyByColourIgnoreCase(String colour);

}


