package com.gmy.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
public interface OrderMapper {
	@Select("select 'order'")
	String selectById();
}
