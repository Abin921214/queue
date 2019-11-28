package com.jzhl.queue.mapper;

import com.jzhl.queue.model.DoorFaceDeviceRelation;
import com.jzhl.queue.model.DoorFaceDeviceRelationExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * DoorFaceDeviceRelationDAO继承基类
 */
@Mapper
public interface DoorFaceDeviceRelationDAO extends MyBatisBaseDao<DoorFaceDeviceRelation, Integer, DoorFaceDeviceRelationExample> {
}