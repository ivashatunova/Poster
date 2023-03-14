package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.PosterItem;
@NoArgsConstructor
public class PosterManager {
    private PosterItem[] films = new PosterItem[0];
    private int filmNumber = 5;// сколько фильмов выводить

    public PosterManager(int filmNumber) {
        if (filmNumber <= 0) {
            return;
        }
        this.filmNumber = filmNumber;
    }



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

    public PosterItem[] findLast() {
        int resultLength;//// желаемый размер создаваемого массива
        if (filmNumber>films.length) {
            resultLength = films.length;
        } else {
            resultLength = filmNumber;
        }
        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i]=films [films.length -1 -i];

        }
        return result;
    }


}
