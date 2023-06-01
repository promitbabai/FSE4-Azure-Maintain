package com.iiht.fse4.skilltrackermaintain.repo;

import com.iiht.fse4.skilltrackermaintain.entity.Associate;
import com.iiht.fse4.skilltrackermaintain.entity.Mapping;
import com.iiht.fse4.skilltrackermaintain.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SkillsRepository extends JpaRepository<Skills, String> {


}




