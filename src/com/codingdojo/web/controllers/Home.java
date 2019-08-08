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
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// start a session
		HttpSession session = request.getSession();
		// declare an array list object and copy current listing of all teams
		ArrayList<Team> teamList = Team.getTeamList();
		// set variable to pass the data from the servlet to the website
		request.getSession().setAttribute("arrTeams", teamList);
		
		// only populate the arrayList with team_ID's if there is team data present
		if(request.getParameter("team_id") != null) {
			// iterate through the array adding teams from the Team object
			for(int i = 0; i < teamList.size(); i++) {
				// retrieve the teams
				Team team = teamList.get(i);
				// check for any deleted teams
				// if statement
			}
			// send requested array data back to website to be rendered in html
			response.sendRedirect("/TeamRoster/Home");
		}
		//
		else {
	        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
	        view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
