/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuanhoang.hotelManagement.dao;

import com.thuanhoang.hotelManagement.entities.RoomEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Admin
 */
public interface RoomDaoIF extends CrudRepository<RoomEntity, Integer>{
    RoomEntity findById(int id);
}
