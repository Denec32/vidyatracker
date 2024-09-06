package com.denec.vidyatracker.controllers;

import com.denec.vidyatracker.models.Game;
import com.denec.vidyatracker.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @GetMapping("")
    public List<Game> getGames() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public Game getGame(@PathVariable Long id) {
        return gameService.findById(id).orElseThrow();
    }

    @PostMapping("")
    public Game addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game) {
        if (gameService.findById(id).isEmpty()) throw new RuntimeException("Game not found");
        return gameService.updateGame(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteById(id);
    }
}
