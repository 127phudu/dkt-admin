package vn.edu.vnu.uet.dktadmin.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.vnu.uet.dktadmin.dto.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findByLocationName(String locationName);
    Location findByLocationCode(String locationCode);
}
