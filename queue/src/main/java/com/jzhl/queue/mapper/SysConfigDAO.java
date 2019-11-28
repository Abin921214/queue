package com.jzhl.queue.mapper;

import com.jzhl.queue.model.SysConfig;
import com.jzhl.queue.model.SysConfigExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * SysConfigDAO继承基类
 */
@Mapper
public interface SysConfigDAO extends MyBatisBaseDao<SysConfig, Integer, SysConfigExample> {
}