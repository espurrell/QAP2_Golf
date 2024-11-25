package com.keyin.golfclub.services;

import com.keyin.golfclub.entity.Member;
import com.keyin.golfclub.entity.Tournament;
import com.keyin.golfclub.repositories.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Tournament getTournamentById(Long id) {
        return tournamentRepository.findById(id).orElseThrow(() -> new RuntimeException("Tournament not found"));
    }

    public Tournament addMemberToTournament(Long tournamentId, Member member) {
        Tournament tournament = getTournamentById(tournamentId);
        tournament.getParticipatingMembers().add(member);
        return tournamentRepository.save(tournament);
    }
}
