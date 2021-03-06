package vn.edu.vnu.uet.dktadmin.dto.dao.subjectSemester;

import vn.edu.vnu.uet.dktadmin.dto.model.SubjectSemester;

import java.util.List;

public interface SubjectSemesterDao {
    SubjectSemester store(SubjectSemester subjectSemester);
    SubjectSemester getById(Long id);
    SubjectSemester getBySubjectIdAndSemesterId(Long subjectId, Long semesterId);
    List<SubjectSemester> getBySemesterId(Long semesterId);
}
