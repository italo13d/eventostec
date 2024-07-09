package com.eventostec.api.domain.adress;


import jakarta.persistence.*;
import com.eventostec.api.domain.event.Event;

import java.util.UUID;

@Table(name = "address")
@Entity
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;

    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
