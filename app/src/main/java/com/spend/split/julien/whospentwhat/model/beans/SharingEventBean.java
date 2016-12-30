package com.spend.split.julien.whospentwhat.model.beans;

import java.util.List;

/**
 * Created by Julien on 29/12/2016.
 */

public class SharingEventBean {

    private List<ParticipantBean> participantsList;

    private List<TransactionBean> transactionsList;

    private String name;

    public SharingEventBean(){

    }

    public SharingEventBean(String currentName){
        this.name = currentName;
    }

    public List<ParticipantBean> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<ParticipantBean> participantsList) {
        this.participantsList = participantsList;
    }

    public List<TransactionBean> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<TransactionBean> transactionsList) {
        this.transactionsList = transactionsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
