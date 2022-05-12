package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private String image;
	private Integer count;
	
	public MovieDTO() {
		
	}

	public MovieDTO(Long id, String title, Double score, String image, Integer count) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.image = image;
		this.count = count;
	}
	
	public MovieDTO(Movie movie) {
		this.id = movie.getId();
		this.title = movie.getTitle();
		this.score = movie.getScore();
		this.image = movie.getImage();
		this.count = movie.getCount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}
