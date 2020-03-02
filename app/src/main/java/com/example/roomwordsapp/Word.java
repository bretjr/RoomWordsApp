package com.example.roomwordsapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {
    // Member Variable
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String word;
    // Constructor
    public Word(@NonNull String word) {this.word = word;}
    // Getter
    public String getWord() {return this.word;}
}
