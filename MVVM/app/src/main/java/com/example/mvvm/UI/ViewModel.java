package com.example.mvvm.UI;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.POJO.MovieModel;

public class ViewModel extends androidx.lifecycle.ViewModel {
    MutableLiveData<String> MutableLiveDataName = new MutableLiveData<>() ;

    public void getMovieName() {
        String name;
        name = getMovieFromDB().getName();
        MutableLiveDataName.setValue(name);
    }

    private MovieModel getMovieFromDB() {
        return new MovieModel("Cast Away", "1999-6-9", 1, "This Film is amazing");
    }
}
