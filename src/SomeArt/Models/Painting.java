package SomeArt.Models;

import SomeArt.Abstracts.ArtWork;
import SomeArt.Interfaces.BelongsInAMuseum;

public class Painting extends ArtWork implements BelongsInAMuseum {
	public String paintType;
	
	public Painting(String title, String artist, Integer year, String paintType) {
		super(title, artist, year);
		this.paintType = paintType;
	}
	
	public void viewArt() {
		System.out.println(
			title + " by " + artist + 
			" using " + paintType + " (" + year + ")"
		);
	}
	
}
