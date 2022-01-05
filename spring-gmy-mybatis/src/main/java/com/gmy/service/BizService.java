package com.gmy.service;

import com.gmy.mapper.OrderMapper;
import com.gmy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
@Service
public class BizService {
	@Autowired
	private UserMapper userMapper;

	public void test(){
		System.out.println("userMapper:"+userMapper.selectById());
	}
}
