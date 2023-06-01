package com.iiht.fse4.skilltrackermaintain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "skills")
public class Skills {

    @Id
    private String skillid;

    @Column
    private String skillname;


    public String toString()
    {
        return "\n\n MAPPING TABLE DATA\n" + skillid + " | " + skillname ;
    }
}
