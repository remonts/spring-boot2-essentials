package com.renan.springboot2.repository;

import com.renan.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
