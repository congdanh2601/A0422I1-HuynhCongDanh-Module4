package com.example.song_validation.repository;

import com.example.song_validation.bean.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song, Integer> {
}
