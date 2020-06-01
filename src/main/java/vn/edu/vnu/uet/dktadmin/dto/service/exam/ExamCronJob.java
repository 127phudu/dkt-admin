package vn.edu.vnu.uet.dktadmin.dto.service.exam;

import ma.glasnost.orika.MapperFacade;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import vn.edu.vnu.uet.dktadmin.dto.dao.exam.ExamDao;
import vn.edu.vnu.uet.dktadmin.dto.dao.location.LocationDao;
import vn.edu.vnu.uet.dktadmin.dto.dao.room.RoomDao;
import vn.edu.vnu.uet.dktadmin.dto.dao.roomSemester.RoomSemesterDao;
import vn.edu.vnu.uet.dktadmin.dto.dao.subject.SubjectDao;
import vn.edu.vnu.uet.dktadmin.dto.dao.subjectSemester.SubjectSemesterDao;
import vn.edu.vnu.uet.dktadmin.dto.model.Exam;
import vn.edu.vnu.uet.dktadmin.dto.model.redis.RedisExam;
import vn.edu.vnu.uet.dktadmin.dto.service.roomSemester.RoomSemesterService;
import vn.edu.vnu.uet.dktadmin.dto.service.subjectSemester.SubjectSemesterService;
import vn.edu.vnu.uet.dktadmin.rest.model.exam.ListRegisterResultResponse;
import vn.edu.vnu.uet.dktadmin.rest.model.exam.RegisterResultResponse;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Configuration
@EnableScheduling
public class ExamCronJob {
    private final ExamDao examDao;
    private final MapperFacade mapperFacade;
    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ExamCronJob(ExamDao examDao, MapperFacade mapperFacade) {
        this.examDao = examDao;
        this.mapperFacade = mapperFacade;
    }

//    @Scheduled(fixedDelay = 1000)
//    public void scheduleFixedDelayTask() {
//        System.out.println(
//                "Fixed delay task - " + System.currentTimeMillis() / 1000);
//    }

//    @Scheduled(fixedDelay = 10000)
    public void SyncRedisDataToSqlDatabase() {
        List<RedisExam> redisExams = examDao.getAllFromRedis();
        List<Exam> exams = mapperFacade.mapAsList(redisExams, Exam.class);
        if(examDao.SyncRedisDataToSqlDatabase(exams)) {
            System.out.println("Syncing table exams from redis to sql successfully");
        }

    }
}
