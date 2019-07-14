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


}
