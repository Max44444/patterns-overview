package com.company.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    ArrayList<SongComponent> songComponents = new ArrayList<>();
    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return songComponents.get(componentIndex);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " " +
            getGroupDescription());

        for (SongComponent component : songComponents) {
            component.displaySongInfo();
        }
    }
}
