package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// start a session
		HttpSession session = request.getSession();
		// declare an array list object and copy current team list ID's
		ArrayList<Team> teamList = Team.getTeamList();
		// set variable to pass the data from the servlet to the website
		request.getSession().setAttribute("arrTeam", teamList);
		
		
		// check if player null
        
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
        view.forward(request, response);
        
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// declare team string variable for team name
		String teamN = (String) request.getParameter("teamN"); 
		// create new team (instantiate team object with team name data)
		new Team(teamN);
		// 
		response.sendRedirect("/TeamRoster/Home" + teamN);
			
		// doGet(request, response);
	}

}
