package ru.netology.manager;

import ru.netology.domain.PosterItem;


public class PosterManager {
    private PosterItem[] films = new PosterItem[0];

    public void save(PosterItem film) {
        PosterItem[] tmp = new PosterItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public PosterItem[] findAll() {
        return films;
    }

//    public PosterItem[] findLast() {
//
//    }
}
