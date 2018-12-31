package com.kh.semi.customer.order.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.kh.semi.customer.order.model.dao.OrderDao;

import static com.kh.semi.customer.common.JDBCTemplate.*;
public class OrderService {

	public OrderService() {
		// 생성자에옵
	}

	public ArrayList<ArrayList<HashMap<String, Object>>> selectOrderProductList(String[] productNums, String userId) {
		Connection con = getConnection();
		ArrayList<ArrayList<HashMap<String, Object>>> list = new ArrayList<ArrayList<HashMap<String, Object>>>();
		if(productNums.length > 0) {
			for(String productCode : productNums) {
				list.add((new OrderDao().selectOrderProductList(con,productCode,userId)));
				
			}
		}
		close(con);
		return list;
	}

}
