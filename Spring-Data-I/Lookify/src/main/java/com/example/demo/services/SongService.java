package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Song;
import com.example.demo.repositories.SongRepository;


@Service
public class SongService {
	
	private SongRepository songRepository;
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	public void addSong(Song song) {
		songRepository.save(song);
	}
	public List<Song> getAllSongs() {
		return (List<Song>) songRepository.findAll();
	}
	public Song getSong(Long id) {
		Optional<Song> optionalBook = songRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
	public List<Song> getSearchSongs(String artist){
		return songRepository.findByArtist(artist);
	}
	public List<Song> getTopSongs(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}

}
