package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class PosterManagerTest {
    PosterItem film1 = new PosterItem(1,"Неуловимые", "комедия");
    PosterItem film2 = new PosterItem(2,"Бладшот>", "боевик");
    PosterItem film3 = new PosterItem(3,"Вперед", "мультфильм");
    PosterItem film4 = new PosterItem(4,"Отель Белград", "комедия");

    @Test
    public void testSaveFilm() {
        PosterManager poster = new PosterManager();
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);

        PosterItem[] expected = {film1, film2, film3, film4};
        PosterItem[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected,actual);


    }
}

