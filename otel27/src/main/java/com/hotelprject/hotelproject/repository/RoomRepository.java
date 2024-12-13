package com.hotelprject.hotelproject.repository;
import com.hotelprject.hotelproject.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface RoomRepository extends JpaRepository<Room, Long > {
    List<Room> findAllByAvailableIsTrue();
}