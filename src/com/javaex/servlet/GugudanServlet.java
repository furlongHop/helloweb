package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 언어 포맷 지정
		response.setContentType("text/html;charset=utf-8");

		// 파라미터 값 꺼내기(주소창에서 String으로 받은 값 int로 변환)
		int dan = Integer.parseInt(request.getParameter("dan"));

		PrintWriter out = response.getWriter();

		out.println("<table border='1'>");
		for (int i = 1; i <= 9; i++) {
			out.println("	<tr>");
			out.println("		<td>" + dan + "</td>");
			out.println("		<td>" + i + "</td>");
			out.println("		<td>" + dan * i + "</td>");
			out.println("	</tr>");
		}
		out.println("</table>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
