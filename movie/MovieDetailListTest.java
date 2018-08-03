package com.movie;

public class MovieDetailListTest {
	public static void main(String[] args) {

		Movie_DetailsList movie = new Movie_DetailsList();
		movie.addMovie(new Movie_Details("DTPH", "SRK", "Madhuri", "Romantic"));
		movie.addMovie(new Movie_Details("Guru", "Abhi", "Aish", "Romantic"));
		movie.addMovie(new Movie_Details("Dabang", "Salma", "Sonali", "Action"));
		movie.addMovie(new Movie_Details("Bhootnath", "Amitabh", " ", "Comedy"));
		// Function for finding by movie name
		boolean checkByName = movie.findByName("Dabang2");
		if (checkByName) {
			System.out.println("Movie Found");
		} else {
			System.out.println("Movie not Found");
		}
		// Function for finding by movie genre

		boolean checkByGenre = movie.findByGenre("Thriller");

		if (checkByGenre) {
			System.out.println("Movie Found");
		} else {
			System.out.println("Movie not Found");
		}
		// Sorting and removing movie
		movie.sort();
		movie.removeMovie("DTPH");
		movie.display();

	}
}
