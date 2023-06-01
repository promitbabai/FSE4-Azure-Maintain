package com.iiht.fse4.skilltrackermaintain;

import com.iiht.fse4.skilltrackermaintain.entity.Associate;
import com.iiht.fse4.skilltrackermaintain.entity.Mapping;
import com.iiht.fse4.skilltrackermaintain.entity.Skills;
import com.iiht.fse4.skilltrackermaintain.exception.CredentialsMismatchException;
import com.iiht.fse4.skilltrackermaintain.model.Profile;
import com.iiht.fse4.skilltrackermaintain.model.SkillsFromUI;
import com.iiht.fse4.skilltrackermaintain.repo.AssociateRepository;
import com.iiht.fse4.skilltrackermaintain.repo.MappingRepository;
import com.iiht.fse4.skilltrackermaintain.repo.SkillsRepository;
import com.iiht.fse4.skilltrackermaintain.service.AssociateService;
import com.iiht.fse4.skilltrackermaintain.service.MappingService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class SkillTrackerMaintainApplicationTests {

//	@Autowired
//	private AssociateService associateService;
//
//	@MockBean
//	private AssociateRepository associateRepository;
//
//	@MockBean
//	private MappingRepository mappingRepository;
//
//	@MockBean
//	private SkillsRepository skillsRepository;
//
//	@Test
//	void contextLoads() { }
//
//	@Test
//	public void getAllAssociatesTest(){
//		when(associateRepository.findAll()).thenReturn(Stream
//				.of(new Associate("211221","CTS000001","Trip","8989786778","trip@skilltracker.com","10-02-2022","Trip12@","Y"))
//				.collect(Collectors.toList()));
//		assertEquals(1, associateService.getAllAssociates().size());
//	}
//
//	@Test
//	public void getAllSkillsTest(){
//		when(skillsRepository.findAll()).thenReturn(Stream
//				.of(new Skills("T01","angular"))
//				.collect(Collectors.toList()));
//		assertEquals(1, associateService.getAllSkills().size());
//	}
//
//	@Test
//	public void getAssociateSkillRatingsTest(){
//		when(mappingRepository.findAll()).thenReturn(Stream
//				.of(new Mapping("125432562123","CTS000001","T01","16"))
//				.collect(Collectors.toList()));
//		assertEquals(1, associateService.getAssociateSkillRatings("CTS000001").size());
//	}
//
//	@Test
//	public void addProfileTest(){
//
//		List<SkillsFromUI> techSkills = new ArrayList<>();
//		SkillsFromUI element1 = new SkillsFromUI("23123123123","T01","angular","16");
//		techSkills.add(element1);
//
//		List<SkillsFromUI> nonTechSkills = new ArrayList<>();
//		SkillsFromUI element2 = new SkillsFromUI("23123123124","N01","communication","16");
//		nonTechSkills.add(element2);
//
//		Profile profile = new Profile("CTS000001","Trip","2121434332","trip@skilltracker.com","12-07-23","Trip12@",techSkills,nonTechSkills);
//
////		Associate associate = associateService.populateEntityAssociate(profile);
////
////		when(associateRepository.save(associate)).thenReturn(associate);
//
//		assertEquals(200, associateService.addProfile(profile).getStatus());
//
//	}

//	@Test
//	public void validateUserCredentialsTest(){
//		when(associateRepository.findAll()).thenReturn(Stream
//				.of(new Associate("211221","CTS000001","Trip","8989786778","trip@skilltracker.com","10-02-2022","Trip12@","Y"))
//				.collect(Collectors.toList()));
//
//		List<SkillsFromUI> techSkills = new ArrayList<>();
//		SkillsFromUI element1 = new SkillsFromUI("23123123123","T01","angular","16");
//		techSkills.add(element1);
//
//		List<SkillsFromUI> nonTechSkills = new ArrayList<>();
//		SkillsFromUI element2 = new SkillsFromUI("23123123124","N01","communication","16");
//		nonTechSkills.add(element2);
//
//		Profile profile = new Profile("CTS000001","Trip","8989786778","trip@skilltracker.com","10-02-2022","Trip12@",techSkills,nonTechSkills);
//
//		assertEquals(profile, associateService.validateUserCredentials("CTS000001", "Trip12@"));
//	}

//	@Test
//	public void getAssociaiiteByIDTest(){
//		Associate associate = new Associate("211221","CTS000001","Trip","8989786778","trip@skilltracker.com","10-02-2022","Trip12@","Y");
//		when(associateRepository.findByAssociateid(associate.getAssociateid())).thenReturn(Stream
//				.of(new Associate("211221","CTS000001","Trip","8989786778","trip@skilltracker.com","10-02-2022","Trip12@","Y"))
//				.collect(Collectors.toList()));
//		assertEquals(associate, associateService.getAssociateByID("CTS000001"));
//
//	}

}
