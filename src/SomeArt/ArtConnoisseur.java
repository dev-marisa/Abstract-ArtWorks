package SomeArt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import SomeArt.Interfaces.BelongsInAMuseum;
import SomeArt.Models.Painting;
import SomeArt.Models.Sculpture;

public class ArtConnoisseur {
	public static void main(String[] arrrrrrgs) {
		System.out.println("Art exists!?");
		
		Painting art1 = new Painting("Starry Night", "Van Gogh", 1889, "oil paint");
		Painting art2 = new Painting("Persistence of Memory", "Dali", 1931, "oil paint");
		Sculpture art3 = new Sculpture("Fountain", "Duchamp", 1917, "glazed ceramic");
		Sculpture art4 = new Sculpture("David", "Michelangelo", 1504, "marble");
		
		// ArtWork art4 = new ArtWork("Fountain", "Duchamp", 1917);
		// Java will not allow this!
		
		ArrayList<BelongsInAMuseum> museum = new ArrayList<BelongsInAMuseum>();
		museum.add(art1);
		museum.add(art2);
		museum.add(art3);
		museum.add(art4);
        
		Collections.shuffle(museum);
		
		for(BelongsInAMuseum art: museum) {
			art.viewArt();
		}
	}
}
