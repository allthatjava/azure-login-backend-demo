package io.meys.azureadtest.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GroupBean {

    private String group1="b4626ad4-ef2a-4148-9c33-0d3e5604aca0";
    private String group2="de845db5-618d-4a72-a70e-4f06687a9ac7";

    private String claimField="groups";

    public String getGroup1(){
        return group1;
    }
    public String getGroup2(){
        return group2;
    }

    public String getClaimField(){
        return claimField;
    }

}
