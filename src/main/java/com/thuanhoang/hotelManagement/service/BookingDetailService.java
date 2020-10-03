/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuanhoang.hotelManagement.service;

import com.thuanhoang.hotelManagement.dao.BookingDetailDaoIF;
import com.thuanhoang.hotelManagement.entities.BookingDetailEntity;
import com.thuanhoang.hotelManagement.entities.RoomEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Admin
 */
public class BookingDetailService {
    
    @Autowired BookingDetailDaoIF bookingDetailDao;
    @Autowired RoomService roomService;
    
    public List<RoomEntity> getAvailableRoom(Date timeIn, Date timeOut) {
        List<RoomEntity> availableRoomList = new ArrayList<RoomEntity>();
        List<BookingDetailEntity> bookingDetailList = (List<BookingDetailEntity>) bookingDetailDao.findAll();
        List<RoomEntity> roomList = roomService.getAllListRoom();
        
        for (RoomEntity roomEntity : roomList) {
            for (BookingDetailEntity bookingDetail : bookingDetailList) {
                if (bookingDetail.getRoomEntities().getId() == roomEntity.getId()) {
                    if ((timeIn.after(bookingDetail.getCheckinDate()) && timeIn.before(bookingDetail.getCheckoutDate()))
                            || (timeOut.after(bookingDetail.getCheckinDate()) && timeOut.before(bookingDetail.getCheckoutDate()))
                            || (bookingDetail.getCheckinDate().after(timeIn) && bookingDetail.getCheckinDate().before(timeOut))) {
                        break;
                    } else {
                        availableRoomList.add(roomService.findById(roomEntity.getId()));
                    }
                } else {
                    break;
                }
            }
        }
        return availableRoomList;
    }
    
}
