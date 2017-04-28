package com.wdy.yzm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �����֤Servlet
 * @author wangdy
 *
 */
public class ResultServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**  
	 * ��̨��֤����
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String validateC = (String) request.getSession().getAttribute("checkcode");
		//��ǰ̨�������û��������֤��
		String veryCode = request.getParameter("c");
		PrintWriter out = response.getWriter();
		if (veryCode == null || "".equals(veryCode)) {
			out.println("��������֤�룡");
		} else {
//			if (validateC.equals(veryCode)) {
			//���Դ�Сд����
			if (validateC.equalsIgnoreCase(veryCode)) {
				out.println(1);
			} else {
				out.println("��֤���������");
			}
		}
		out.flush();
		out.close();
	}

}
