package testvagarant;

import java.util.*;

public class RecentlyPlayedStore {
	private int capacity;
	private Map<String, LinkedList<String>> store;

	public RecentlyPlayedStore(int capacity) {
		this.capacity = capacity;
		store = new HashMap<>();
	}

	public LinkedList<String> addSong(String user, String song) {
		if (!store.containsKey(user)) {
			store.put(user, new LinkedList<>());
		}

		LinkedList<String> songs = store.get(user);

		// Remove the song if it already exists in the list
		songs.remove(song);

		// Add the song at the beginning of the list
		songs.addFirst(song);

		// Trim the list if it exceeds the capacity
		if (songs.size() > capacity) {
			songs.removeLast();
		}
		return songs;
	}

	public LinkedList<String> getRecentlyPlayedSongs(String user) {
		return store.getOrDefault(user, new LinkedList<>());
	}

}
