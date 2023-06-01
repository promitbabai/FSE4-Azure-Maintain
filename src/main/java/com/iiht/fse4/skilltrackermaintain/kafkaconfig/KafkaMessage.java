package com.iiht.fse4.skilltrackermaintain.kafkaconfig;

import com.iiht.fse4.skilltrackermaintain.model.Profile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KafkaMessage {


    private String mongoOpsCode;
    private Profile profile;
}
