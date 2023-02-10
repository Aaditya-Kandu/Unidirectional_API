package com.example.SQL_Rocks;


import jakarta.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int cardIssued;

    private int fine;

    @Enumerated(value = EnumType.STRING)  // use for telling the sql accept this data type as a String
    CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    User user;

}
