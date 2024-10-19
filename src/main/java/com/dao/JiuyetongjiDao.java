package com.dao;

import com.entity.JiuyetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyetongjiView;

/**
 * 就业统计 Dao 接口
 *
 * @author 
 */
public interface JiuyetongjiDao extends BaseMapper<JiuyetongjiEntity> {

   List<JiuyetongjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
