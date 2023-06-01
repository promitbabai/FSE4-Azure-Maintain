package com.iiht.fse4.skilltrackermaintain.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Profile implements Serializable {

    private String associateid;

    private String name;

    private String mobile;

    private String email;

    private String lastupdated;

    private String password;

    private String role;

    private List<SkillsFromUI> techskills;

    private List<SkillsFromUI> nontechskills;


    public Profile(String associateid, String name, String mobile, String email, String lastupdated, String password, String role, List<SkillsFromUI> techskills, List<SkillsFromUI> nontechskills) {
        this.associateid = associateid;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.lastupdated = lastupdated;
        this.password = password;
        this.role = role;
        this.techskills = techskills;
        this.nontechskills = nontechskills;
    }

    public String toString()
    {
        return "\n\n PROFILE DATA\n" + associateid + " | " + name + " | " + mobile + " | " + email + " | "
                + lastupdated + " | " + password + " | " + role;
    }

}
