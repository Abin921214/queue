package com.jzhl.queue.mapper;

import com.jzhl.queue.model.DoorFaceInfo;
import com.jzhl.queue.model.DoorFaceInfoExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * DoorFaceInfoDAO继承基类
 */
@Mapper
public interface DoorFaceInfoDAO extends MyBatisBaseDao<DoorFaceInfo, Integer, DoorFaceInfoExample> {
}