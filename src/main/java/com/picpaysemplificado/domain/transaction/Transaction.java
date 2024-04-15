package com.picpaysemplificado.domain.transaction;

import com.picpaysemplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount; // quantia

    // um usuário pode ter várias tranzações, mais uma uma trazaçao pode ter um sender e um receptor
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender; // remetente

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver; // destinatário

    private LocalDateTime timestamp;
}
