package com.kh.semi.customer.product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.semi.customer.member.model.vo.Member;
import com.kh.semi.customer.product.model.service.ProductService;

/**
 * Servlet implementation class DeleteWishListInDetailServlet
 */
@WebServlet("/deleteWishListInDetail.pd")
public class DeleteWishListInDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteWishListInDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Member loginUser = (Member)request.getSession().getAttribute("loginUser");
		
		if(loginUser != null) {
			String productCode = request.getParameter("productCode");
			
			int result = new ProductService().deleteWishList(loginUser.getUserId(), productCode);
			
			if(result > 0) {
				response.setContentType("application/json");
				response.setCharacterEncoding("utf-8");
				
				new Gson().toJson("상품이 삭제되었습니다.", response.getWriter());
			} else {
				response.setContentType("application/json");
				response.setCharacterEncoding("utf-8");
				
				new Gson().toJson("상품이 삭제에 실패하였습니다.", response.getWriter());
			}
		} else {
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			
			new Gson().toJson("로그인 이후에 등록이 가능합니다.", response.getWriter());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
