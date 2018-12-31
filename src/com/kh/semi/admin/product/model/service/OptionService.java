package com.kh.semi.admin.product.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import static com.kh.semi.admin.common.JDBCTemplate.*;

import com.kh.semi.admin.product.model.dao.OptionDao;
import com.kh.semi.admin.product.model.vo.Option;

public class OptionService {

	public ArrayList<Option> selectOptionNum(String optionNum) {
		Connection con = getConnection();
		ArrayList<Option> list = new OptionDao().selectOptionNum(con,optionNum);
		close(con);
		
		return list;
	}

	public ArrayList<Option> selectOptionName(String optionNum) {
		Connection con = getConnection();
		ArrayList<Option> list = new OptionDao().selectOptionName(con,optionNum);
		close(con);
		
		return list;
	}

}
