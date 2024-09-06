package com.denec.vidyatracker.services;

import com.denec.vidyatracker.models.Game;
import com.denec.vidyatracker.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public Optional<Game> findById(Long id) {
        return gameRepository.findById(id);
    }

    public void deleteById(Long id) {
        gameRepository.deleteById(id);
    }

    public Game addGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Game game) {
        return gameRepository.save(game);
    }
}
