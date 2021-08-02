package org.example.league_of_legends.repository;

import org.example.league_of_legends.exceptions.SkinNotFoundException;
import org.example.league_of_legends.model.Skin;

import java.util.ArrayList;

public class SkinRepository {
    private ArrayList<Skin> skins = new ArrayList<>();

    public Skin save(Skin skin) {
        skins.add(skin);
        return skin;
    }

    public ArrayList<Skin> findAll() {
        return skins;
    }

    public Skin findById(int id) {
        for (Skin skin : skins) {
            if (skin.getId() == id) {
                return skin;
            }
        }
        throw new SkinNotFoundException(id);
    }

    public void update(Skin skinUpdate) {
        for (Skin skin : skins) {
            if (skin.getId() == skinUpdate.getId()) {
                skins.remove(skin);
                skins.add(skinUpdate);
                break;
            }
        }
    }

    public void deleteById(int id) {
        for (Skin skin : skins) {
            if (skin.getId() == id) {
                skins.remove(skin);
                break;
            }
        }
    }
}
