package com.spend.split.julien.whospentwhat.model.beans;

import java.util.List;

/**
 * Created by Julien on 29/12/2016.
 */

public class TransactionBean {

    private static String IMAGES_PATH = "";

    private double transactionAmount;

    private ParticipantBean buyer;

    private List<ParticipantBean> participantsList;

    private TransactionType type;

    private static enum TransactionType {
         TRIP, RESTAURANT, GIFT, SHOPPING, FOOD, SPORT, DRINK, PETROL;

        private String getImagePath() {
            switch(this) {
                case TRIP:
                    return"";
                case RESTAURANT:
                    return"";
                case GIFT:
                    return"";
                case SHOPPING:
                    return"";
                case FOOD:
                    return"";
                case SPORT:
                    return"";
                case DRINK:
                    return"";
                case PETROL:
                    return"";
                default:
                    return"";
            }
        }
    }

    public TransactionBean(){

    }

    public List<ParticipantBean> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<ParticipantBean> participantsList) {
        this.participantsList = participantsList;
    }

    public ParticipantBean getBuyer() {
        return buyer;
    }

    public void setBuyer(ParticipantBean buyer) {
        this.buyer = buyer;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
