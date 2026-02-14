package org.Bnzemeine.services;

import org.Bnzemeine.model.Room;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RoomHandler <T extends Room>
{
    private List<T> rooms=new ArrayList<>();

    public void addRoom(T room){
        rooms.add(room);
    }
    public Optional<T> bookRoom(){
        if(rooms.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(rooms.get(0));
    }

    public List<T> getSortedAvailableRooms(){
        return rooms.stream()
                .filter(r->r.getPrice()>0)
                .sorted((r1,r2)->Double.compare(r1.getPrice(),r2.getPrice())).collect(Collectors.toList());
    }
    public List<T> getRooms(){
        return rooms;
    }

}
