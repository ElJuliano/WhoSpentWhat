package com.spend.split.julien.whospentwhat.model.beans;

/**
 * Created by Julien on 29/12/2016.
 */

public class ParticipantBean {

    private String name;

    private String email;

    public ParticipantBean(){

    }

    public ParticipantBean(String currentName){
        this.name = currentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
