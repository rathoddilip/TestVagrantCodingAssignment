
# Project Title : Recently played songs list

# Description

This is an in-memory store implementation for recently played songs that allows storing a list of song-user pairs. It has the capability to accommodate N songs per user with a fixed initial capacity. The store is designed to fetch recently played songs based on the user and automatically eliminate the least recently played songs when the store becomes full.



## Table Of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Example](#example)

## Overview

This in-memory store provides a way to manage recently played songs for multiple users. It allows you to store a song and associate it with a user. The store maintains the order of recently played songs and automatically removes the least recently played songs when the capacity is reached.

## Features

- Accommodates N songs per user with a fixed initial capacity.
- Stores a list of song-user pairs, where each song is linked to a user.
- Fetches recently played songs.
- Automatically eliminates the least recently played songs when the store becomes full.

## Usage
To use the Recently Played Songs In-Memory Store in your application, follow these steps:

1. Add the `RecentlyPlayedStore` class to a project.
2. Create an instance of `RecentlyPlayedStore` with the desired initial capacity.
3. Use the `addSong` method to add a song to the store for a specific user.
4. Use the `getRecentlyPlayedSongs` method to fetch the recently played songs for a user.

## Example
To use the Recently Played Songs In-Memory Store in your
Here's an example of how to use the Recently Played Songs In-Memory Store:

```java
// Take the capacity of songs from the user
System.out.print("Enter Initial Capacity of Songs - ");
int songsCapacity = scanner.nextInt();
RecentlyPlayedStore store = new RecentlyPlayedStore(songsCapacity);

// Add songs for a user by using the loops
for (int i = 0; i < numberOfSongs.length; i++) {
            System.out.println("Please enter Songs ");
            numberOfSongs[i] = scanner.nextLine();
            expectedRecentPlayedSong = recentPlayedStore.addSong(userName, numberOfSongs[i]);

        }


// Get recently played songs for a user

System.out.print("Please enter User name: ");
String userName = scanner.next();
List<String> user1RecentlyPlayedSongs = store.getRecentlyPlayedSongs(userName);
System.out.println("Recently played songs for " + userName + " User is: "+ recentPlayedStore.getRecentlyPlayedSongs(userName));

In the example code above, a RecentlyPlayedStore object is created with an initial capacity of 'User entered number' songs user. Several songs are added for ausers using the addSong method. The getRecentlyPlayedSongs method is then used to fetch the recently played songs for a specific user.

## TestCases

1. Test eliminating least recently played songs:
    - Input: User "user" adds more songs, exceeding the capacity multiple times
    - Expected Output: The least recently played songs for "user" are consistently eliminated to maintain the capacity.