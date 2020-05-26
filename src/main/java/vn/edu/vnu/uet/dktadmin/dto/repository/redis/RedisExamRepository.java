package vn.edu.vnu.uet.dktadmin.dto.repository.redis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.edu.vnu.uet.dktadmin.dto.model.Exam;
import vn.edu.vnu.uet.dktadmin.dto.model.redis.RedisExam;

import java.time.LocalDate;
import java.util.List;

;

@Repository
public interface RedisExamRepository extends JpaRepository<RedisExam, Long> {
    Exam findByExamCode(String examCode);
    List<Exam> findBySemesterId(Long semesterId);
    List<Exam> findByRoomSemesterIdAndDate(Long roomSemesterId, LocalDate date);
    List<Exam> findBySemesterIdAndSubjectId(Long semesterId, Long subjectId);
    List<Exam> findByIdIn(List<Long> ids);
}
