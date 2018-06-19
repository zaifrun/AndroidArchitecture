package org.example.androidarchitecture;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class DataViewModel extends ViewModel {


    private MutableLiveData<List<String>> countries;
    public MutableLiveData<List<String>> getCountries() {
        if (countries == null) {
            countries = new MutableLiveData<>();
            ArrayList<String> data = new ArrayList<>();
            data.add("Denmark");
            data.add("Germany");
            countries.setValue(data);

        }
        return countries;
    }

}
