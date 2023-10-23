package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long cbu;
    private Double sum;
    private TransactionType type;

    public Transaction(Long cbu, TransactionType type, Double sum) {
        this.cbu = cbu;
        this.type = type;
        this.sum = sum;
    } 

    public Transaction() {}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getCbu(){
        return cbu;
    }

    public void setCbu(Long cbu){
        this.cbu = cbu;
    }

    public Double getSum(){
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public TransactionType getType(){
        return type;
    }

    public void setType(TransactionType type){
        this.type = type;
    }
}
