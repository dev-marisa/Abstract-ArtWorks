package SomeArt.Abstracts;


// exists for us to inherit from
// we cannot make in instance of an ArtWork 
// but we could make a Painting, Sculpture, etc...
public abstract class ArtWork {
	public String title;
	public String artist;
	public Integer year;
	
	public ArtWork(String title, String artist, Integer year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public String toString() {
		return title + " by " + artist + " (" + year + ")";
	}
	
}
