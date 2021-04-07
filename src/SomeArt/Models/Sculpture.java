package SomeArt.Models;

import SomeArt.Abstracts.ArtWork;
import SomeArt.Interfaces.BelongsInAMuseum;

public class Sculpture extends ArtWork implements BelongsInAMuseum {
	public String material;
	
	public Sculpture(String title, String artist, Integer year, String material) {
		super(title, artist, year);
		this.material = material;
	}
	
	public void viewArt() {
		System.out.println(
			title + " by " + artist + 
			" using " + material + " (" + year + ")"
		);
	}
	
}
