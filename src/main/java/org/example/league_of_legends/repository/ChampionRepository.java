package org.example.league_of_legends.repository;

import org.example.league_of_legends.exceptions.ChampionNotFoundException;
import org.example.league_of_legends.model.Champion;

import java.util.ArrayList;

public class ChampionRepository {
    private ArrayList<Champion> champions = new ArrayList<>();

    public Champion save(Champion champion) {
        champions.add(champion);
        return champion;
    }

    public ArrayList<Champion> findAll() {
        return champions;
    }

    public Champion findById(int id) {
        for (Champion champion : champions) {
            if (champion.getId() == id) {
                return champion;
            }
        }
        throw new ChampionNotFoundException(id);
    }

    public void update(Champion championUpdate) {
        for (Champion champion : champions) {
            if (champion.getId() == championUpdate.getId()) {
                champions.remove(champion);
                champions.add(championUpdate);
                break;
            }
        }
    }

    public void deleteById(int id) {
        for (Champion champion : champions) {
            if (champion.getId() == id) {
                champions.remove(champion);
                break;
            }
        }
    }
}