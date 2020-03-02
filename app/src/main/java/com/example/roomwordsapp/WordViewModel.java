package com.example.roomwordsapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    // Member Variable
    private WordRepository repository;
    private LiveData<List<Word>> allWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        repository = new WordRepository(application);
        allWords = repository.getAllWords();
    }

    // Getter
    public LiveData<List<Word>> getAllWords() {
        return allWords;
    }

    // Wrapper Method
    public void insert(Word word) {
        repository.insert(word);
    }
}
