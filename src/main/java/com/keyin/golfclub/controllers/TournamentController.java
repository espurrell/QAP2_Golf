package com.keyin.golfclub.controllers;

import com.keyin.golfclub.entity.Member;
import com.keyin.golfclub.entity.Tournament;
import com.keyin.golfclub.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tournaments")

public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.saveTournament(tournament);
    }

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/{id}")
    public Tournament getTournamentById(@PathVariable Long id) {
        return tournamentService.getTournamentById(id);
    }

    @PostMapping("/{id}/members")
    public Tournament addMemberToTournament(@PathVariable Long id, @RequestBody Member member) {
        return tournamentService.addMemberToTournament(id, member);
    }

}
