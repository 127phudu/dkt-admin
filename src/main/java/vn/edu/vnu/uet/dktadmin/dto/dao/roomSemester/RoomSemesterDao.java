package vn.edu.vnu.uet.dktadmin.dto.dao.roomSemester;

import vn.edu.vnu.uet.dktadmin.dto.model.RoomSemester;

import java.util.List;

public interface RoomSemesterDao {
    RoomSemester store(RoomSemester roomSemester);
    List<RoomSemester> getAll();
    RoomSemester getById(Long id);
    RoomSemester getByRoomIdAndSemesterId(Long roomId, Long semesterId);
    List<RoomSemester> getBySemesterId(Long id);
}
