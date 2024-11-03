package com.backend.studycenter.common.repository.course;

import com.backend.studycenter.common.model.course.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.Optional;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {
    //Optional<Technology>findTechnologyByName(String name);
    /*repository ichidagi funksiyalar JpaRepositoryni ichida tayyor bo'lib turadi */
}
