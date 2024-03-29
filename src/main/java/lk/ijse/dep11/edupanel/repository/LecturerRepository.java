package lk.ijse.dep11.edupanel.repository;

import lk.ijse.dep11.edupanel.entity.Lecturer;
import lk.ijse.dep11.edupanel.util.LecturerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
    @Query("SELECT l FROM Lecturer l WHERE l.type = lk.ijse.dep11.edupanel.util.LecturerType.FULL_TIME")
    List<Lecturer> findFullTimeLecturers();

    @Query("SELECT l FROM Lecturer l WHERE l.type = lk.ijse.dep11.edupanel.util.LecturerType.VISITING")
    List<Lecturer> findVisitingLectures();

    List<Lecturer> findLecturersByType(LecturerType type);

}
