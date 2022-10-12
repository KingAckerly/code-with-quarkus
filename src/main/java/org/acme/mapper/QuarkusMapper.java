package org.acme.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.acme.entity.QuarkusTestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuarkusMapper extends BaseMapper<QuarkusTestEntity> {
}
