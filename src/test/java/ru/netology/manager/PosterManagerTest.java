package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class PosterManagerTest {
    PosterItem film1 = new PosterItem(1,"Неуловимые", "комедия");
    PosterItem film2 = new PosterItem(2,"Бладшот>", "боевик");
    PosterItem film3 = new PosterItem(3,"Вперед", "мультфильм");
    PosterItem film4 = new PosterItem(4,"Отель Белград", "комедия");
    PosterItem film5 = new PosterItem(5,"Джентельмены", "боевик");
    PosterItem film6 = new PosterItem(6,"Человек невидимка", "ужасы");
    PosterItem film7 = new PosterItem(7,"Тролли. Мировой тур", "мультфильм");
    PosterItem film8 = new PosterItem(8,"Номер один", "комедия");


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

    @Test
    public void findLastDefaultPositiveTest() {
        PosterManager poster = new PosterManager();
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        PosterItem[] expected = {film8, film7, film6, film5, film4};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastFilmsCustomPositiveTest() {
        PosterManager poster = new PosterManager(3);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        PosterItem[] expected = {film8, film7, film6};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastFilmsNumberMoreThenFilms() {
        PosterManager poster = new PosterManager(10);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        PosterItem[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastFilmsNumberEqualsFilms() {
        PosterManager poster = new PosterManager(5);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        PosterItem[] expected = {film5, film4, film3, film2, film1};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastFilmsNumberEqualsNull() {
        PosterManager poster = new PosterManager(0);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        PosterItem[] expected = {film8, film7, film6, film5, film4};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastFilmsNumberEqualsNegative() {
        PosterManager poster = new PosterManager(-10);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        PosterItem[] expected = {film8, film7, film6, film5, film4};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

}

