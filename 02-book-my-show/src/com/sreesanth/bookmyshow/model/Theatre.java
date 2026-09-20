package com.sreesanth.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String name;
    private final Location location;

    private final List<Screen> screens;

    public Theatre(String name, Location location) {
        this.name = name;
        this.location = location;
        this.screens = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }
}
