package com.keyin.golfclub.repositories;

import com.keyin.golfclub.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
