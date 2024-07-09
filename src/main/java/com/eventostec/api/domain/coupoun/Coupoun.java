package com.eventostec.api.domain.coupoun;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.eventostec.api.domain.event.Event;

import java.util.UUID;

import java.util.Date;

@Entity
@Table(name = "event-coupoun")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupoun {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private Integer discount;

    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
