package org.gmy.test.service.test;

import java.util.Arrays;

/**
 * @Author guomaoyang
 * @Date 2021/9/18
 */
public class C extends B{
	public static void main(String[] args) {
		System.out.println(A.class.isAssignableFrom(C.class));

	}
}
