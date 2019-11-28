package com.jzhl.queue.mapper;

import com.jzhl.queue.model.DoorSubDevice;
import com.jzhl.queue.model.DoorSubDeviceExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * DoorSubDeviceDAO继承基类
 */
@Mapper
public interface DoorSubDeviceDAO extends MyBatisBaseDao<DoorSubDevice, Integer, DoorSubDeviceExample> {
}