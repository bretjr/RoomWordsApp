package com.example.roomwordsapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {
    // Method to insert a word
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);
    // Method to delete all words
    @Query("DELETE FROM word_table")
    void deleteAll();
    // Method to get all words from the table
    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

}

