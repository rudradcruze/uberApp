package com.rudradcruze.project.uber.uberApp.entities;

import com.rudradcruze.project.uber.uberApp.entities.enums.TransactionMethod;
import com.rudradcruze.project.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Wallet wallet;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private String transactionId;

    @CreationTimestamp
    private LocalDateTime timestamp;
}
