package vn.edu.vnu.uet.dktadmin.dto.dao.studentSubject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.vnu.uet.dktadmin.dto.model.StudentSubject;
import vn.edu.vnu.uet.dktadmin.dto.repository.StudentSubjectRepository;

import java.util.List;

@Service
public class StudentSubjectDaoImpl implements StudentSubjectDao {
    @Autowired
    private StudentSubjectRepository studentSubjectRepository;

    @Override
    public List<StudentSubject> getAll() {
        return studentSubjectRepository.findAll();
    }

    @Override
    public StudentSubject store(StudentSubject studentSubject) {
        return studentSubjectRepository.save(studentSubject);
    }

    @Override
    public StudentSubject getByStudentAndSubjectAndSemester(Long studentId, Long subjectId, Long semesterId) {
        return studentSubjectRepository.findByStudentIdAndSubjectIdAndSemesterId(studentId, subjectId, semesterId);
    }

}
