package rs.ac.bg.fon.silab.AppSchSys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.silab.AppSchSys.entities.Teacher;

@Repository
public interface TeacherDAO extends JpaRepository<Teacher, String> {

}
