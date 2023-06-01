package com.iiht.fse4.skilltrackermaintain.controller;


import com.iiht.fse4.skilltrackermaintain.entity.Associate;
import com.iiht.fse4.skilltrackermaintain.entity.Skills;
import com.iiht.fse4.skilltrackermaintain.entity.Mapping;
import com.iiht.fse4.skilltrackermaintain.model.Response;
import com.iiht.fse4.skilltrackermaintain.model.Profile;
import com.iiht.fse4.skilltrackermaintain.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/skill-tracker/api/v1/engineer")
public class MaintainController {

    @Autowired
    AssociateService service;


    /**
     *
     * @return - Return Value
     */
    @GetMapping("/getAllAssociates")
    public List<Associate> getAllAssociates(){
        List<Associate> associateList = service.getAllAssociates();
        return associateList;

    }


    /**
     *
     * @return - Return Value
     */
    @GetMapping("/getAllSkills")
    public List<Skills> getAllSkills(){
        System.out.println("Controller Layer - getAllSkills");
        List<Skills> skillsList = service.getAllSkills();
        return skillsList;

    }

    /**
     *
     * @return - Return Value
     */
    @GetMapping("/getAssociateSkillRatings")
    public List<Mapping> getAssociateSkillRatings(@RequestParam String associateID){
        System.out.println("Controller Layer - getAssociateSkillRatings");
        List<Mapping> ratingsList = service.getAssociateSkillRatings(associateID);
        return ratingsList;

    }

    /**
     *
     * @return - Return Value
     */
    @GetMapping("/getAssociateByID")
    public Associate getAssociateByID(@RequestParam String associateID){
        Associate associate = service.getAssociateByID(associateID);
        return associate;

    }

    /**
     *
     * @return - Return Value
     */
    @GetMapping("/getUserDetails")
    public Profile getUserDetails(@RequestParam String associateID, @RequestParam String associatePassword){
        Profile profile = service.getUserDetails(associateID,associatePassword);
        return profile;

    }

    /**
     *
     * @return - the basic string value
     */
    @GetMapping("/maintainGetData")
    public String getData(){
        return "Hello AddUpdate Microservices";
    }


    @PostMapping("/add-profile")
    public ResponseEntity addProfile (@RequestBody Profile profile){
        Response response = service.addProfile(profile);
        return ResponseEntity.status(HttpStatus.CREATED).body(response.getMessage());
        //return ResponseEntity.status(response.getStatus()).body(response.getMessage());

    }


    @PostMapping("/update-profile")
    public ResponseEntity updateProfile (@RequestBody Profile profile) {
        Response response = service.updateProfile(profile);
        return ResponseEntity.status(response.getStatus()).body(response.getMessage());

    }




//    @PostMapping("/update-profile-old")
//    public ResponseEntity updateProfileOld (@RequestBody Associate associate) {
//        Response response = service.updateProfileOld(associate);
//        return ResponseEntity.status(response.getStatus()).body(response.getMessage());
//
//    }

//
////    @PostMapping("/addOrUpdateAssociate")
////    public ResponseEntity<String> addOrUpdateAssociate(@RequestBody Associate associate){
//        S
//    }


//    @PostMapping("addOrUpdateCourse")
//    public ResponseEntity<String> addorUpdateCourse(@RequestBody Course course) {
//        Course courseByName = courseRepository.findByName(course.getName());
//        Course savedOrUpdated = null;
//        if (courseByName != null) {
//            course.setId(courseByName.getId());
//            savedOrUpdated = courseRepository.save(course);
//            return ResponseEntity.status(HttpStatus.OK).body("Course updated successfully.");
//        }
//        savedOrUpdated = courseRepository.save(course);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Course created successfully.");
//    }

}
