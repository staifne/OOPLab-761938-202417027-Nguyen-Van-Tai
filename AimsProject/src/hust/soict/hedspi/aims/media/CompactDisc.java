package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category,cost);
        this.artist = artist;
    }
    // tao getter cho artist
    public String getArtist(){
        return artist;
    }
    // Them bai hat
    public void addTrack(Track track){
        if(tracks.contains(track)){
            System.out.println("Track '" + track.getTitle() + "' is already in the CD.");
        }else{
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' has been added to the CD.");
        }
    }
    // Xoa bai hat
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' has been removed from the CD."); // [cite: 1075]
        } else {
            System.out.println("Track '" + track.getTitle() + "' is not in the CD."); // [cite: 1075]
        }
    }
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks){
            track.play();
        }
    }
    @Override
    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - "
                + this.getArtist() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }
}
