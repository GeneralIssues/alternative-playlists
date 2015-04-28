package com.example.general.alternative_playlists;

/**
 * Created by General on 28/04/2015.
 */

public class Album {
    public int _albumID;
    public String _albumName;
    String[] _songs;

    Album(int albumID, String albumName, String[] songs){
        _albumID = albumID;
        _albumName = albumName;
        _songs = songs;
    }

    public int get_albumID() {
        return _albumID;
    }

    public void set_albumID(int _albumID) {
        this._albumID = _albumID;
    }

    public String get_albumName() {
        return _albumName;
    }

    public void set_albumName(String _albumName) {
        this._albumName = _albumName;
    }

    public String[] get_songs() {
        return _songs;
    }

    public void set_songs(String[] _songs) {
        this._songs = _songs;
    }
}
