package pl.edu.ath.filmshop.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document
public class Payment {

    @Field
    private String id;

    @Field
    private Long cardNumber;

    @Field
    private LocalDate cardValidation;

    @Field
    private Double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getCardValidation() {
        return cardValidation;
    }

    public void setCardValidation(LocalDate cardValidation) {
        this.cardValidation = cardValidation;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
