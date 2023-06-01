package com.iiht.fse4.skilltrackermaintain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2014-03-31
 */

@Getter
@Setter
@NoArgsConstructor
public class SkillsFromUI {

    private String id;
    private String skillId;
    private String topic;
    private String rating;

    public SkillsFromUI(String id, String skillId, String topic, String rating) {
        this.topic = topic;
        this.rating = rating;
        this.id = id;
        this.skillId = skillId;
    }
}
