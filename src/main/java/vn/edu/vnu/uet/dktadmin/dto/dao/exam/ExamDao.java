package vn.edu.vnu.uet.dktadmin.dto.dao.exam;

import vn.edu.vnu.uet.dktadmin.dto.model.Exam;
import vn.edu.vnu.uet.dktadmin.dto.model.redis.RedisExam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface ExamDao {
    Exam store(Exam exam);
    Boolean cloneRedisExam(List<RedisExam> redisExams);
    Exam getById(Long id);
    Exam getByExamCode(String examCode);
    List<Exam> getBySemesterId(Long semesterId);
    List<Exam> getByRoomAndDate(Long roomSemesterId, LocalDate date);
    List<Exam> getBySemesterIdAndSubjectId(Long semesterId, Long subjectId);
    List<Exam> getExamInListId(List<Long> ids);
}
