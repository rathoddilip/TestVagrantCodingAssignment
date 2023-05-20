import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.*;
import org.junit.jupiter.api.Test;

import testvagarant.RecentlyPlayedStore;

class RecentPlayedSongTestCase {

	@Test
	public void playListSongs() {
		Object expectedRecentPlayedSong = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Initial Capacity of Songs - ");
		int songsCapacity = scanner.nextInt();

		RecentlyPlayedStore recentPlayedStore = new RecentlyPlayedStore(songsCapacity);

		System.out.print("Please enter User name: ");
		String userName = scanner.next();

		System.out.println("Please enter the number of Songs you want to add: ");
		// takes an integer input
		String[] numberOfSongs = new String[scanner.nextInt()];
		// consuming the <enter> from input above
		scanner.nextLine();
		for (int i = 0; i < numberOfSongs.length; i++) {
			System.out.println("Please enter Songs ");
			numberOfSongs[i] = scanner.nextLine();
			expectedRecentPlayedSong = recentPlayedStore.addSong(userName, numberOfSongs[i]);

		}

		System.out.println("Expected Recently played songs for " + userName + " User is: " + expectedRecentPlayedSong);

		System.out.println("Recently played songs for " + userName + " User is: "
				+ recentPlayedStore.getRecentlyPlayedSongs(userName));

		List<String> actualRecentPlayedSong = recentPlayedStore.getRecentlyPlayedSongs(userName);
		assertEquals(expectedRecentPlayedSong, actualRecentPlayedSong);
	}

}
