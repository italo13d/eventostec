package com.eventostec.api.repositories;

import com.eventostec.api.domain.coupoun.Coupoun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoupounRepository extends JpaRepository <Coupoun, UUID> {


}
