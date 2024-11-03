package com.backend.studycenter.common.repository.studycenter;

import com.backend.studycenter.common.model.studycenter.MainCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCenterRepository extends JpaRepository<MainCenter, Long> {
}
