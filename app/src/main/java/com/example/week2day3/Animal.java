package com.example.week2day3;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    private String name;
    private String kingdom;
    private String habitat;
    private String soundUrl;


    public Animal(){}
    public Animal(String name, String kingdom, String habitat, String soundUrl) {
        this.name = name;
        this.kingdom = kingdom;
        this.habitat = habitat;
        this.soundUrl = soundUrl;
    }

    protected Animal(Parcel in) {
        name = in.readString();
        kingdom = in.readString();
        habitat = in.readString();
        soundUrl = in.readString();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(kingdom);
        parcel.writeString(habitat);
        parcel.writeString(soundUrl);
    }
}
