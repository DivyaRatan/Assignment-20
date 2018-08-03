package com.movie;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Movie_DetailsList {
	Set<Movie_Details> movie = new LinkedHashSet<>();

	// Adding New Movie to list

	public void addMovie(Movie_Details moviename) {
		movie.add(moviename);
		System.out.println(moviename.getMov_Name() + " Added");
	}

	// Removing Movie from list

	public void removeMovie(String moviename) {
		Predicate<Movie_Details> delmovie = Movie_Details -> Movie_Details.getMov_Name().equals(moviename);
		movie.removeIf(delmovie);
	}

	// Removing all movie
	public void removeAll() {
		movie.clear();
		System.out.println("All movie get cleared");
	}

	// Function for finding the movie by name
	public boolean findByName(String moviename) {
		Predicate<Movie_Details> checkMovieByName = Movie_Details -> (Movie_Details.getMov_Name().equals(moviename));
		return movie.stream().anyMatch(checkMovieByName);
	}

	// Function for finding the movie by genre
	public boolean findByGenre(String moviename) {
		Predicate<Movie_Details> checkMovieByGenre = Movie_Details -> (Movie_Details.getGenre().equals(moviename));
		return movie.stream().anyMatch(checkMovieByGenre);
	}

	// Displaying all details
	public void display() {
		Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details);
		movie.stream().forEach(disp);
	}

	public void sort() {
		System.out.println("Sorted by Genere");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getGenre)).forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");
		System.out.println("Sorted by Movie");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getMov_Name)).forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");
		System.out.println("Sorted by Lead actor");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getLead_actor)).forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");
		System.out.println("Sorted by Lead actress");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getLead_actress)).forEach(System.out::println);
	}

}
