package com.squads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.squads.dao.UserRepository;
import com.squads.entity.Role;
import com.squads.entity.User;
import com.squads.service.RoleService;
import com.squads.service.UserService;


@Controller
public class SquadsController {
	// Implement Service Functions
	public UserService userService;
	public RoleService roleService;
	public SquadsController(UserService theUserService, RoleService theRoleService) {
		userService = theUserService;
		roleService = theRoleService;
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		User theUser = new User();
		model.addAttribute("user", theUser);

		Role theRole = new Role();
		model.addAttribute("role", theRole);

		return "register";
	}

	@PostMapping("/perform_register")
	public String performRegister(@ModelAttribute("user") User theUser, @ModelAttribute("role") Role theRole) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(theUser.getPassword());
		theUser.setPassword(encodedPassword);
		
		String query = "SELECT username FROM users WHERE username LIKE '%" + theUser.getUsername() + "%'";
		String url = "jdbc:mysql://localhost:3306/login";
		String columnValue = "";
		String username = theUser.getUsername();

		try (Connection connection = DriverManager.getConnection(url, "admin", "it4045"); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				ResultSetMetaData rsmd = resultSet.getMetaData();
				int columnsNumber = rsmd.getColumnCount();

				while (resultSet.next()) {
					for (int i = 1; i <= columnsNumber; i++) {
						if (i > 1) System.out.print(",  ");
						columnValue = resultSet.getString(i);

						System.out.println(columnValue);
						System.out.println(username);
					}
					System.out.println("");
				}
			}
		}
		catch (SQLException e) {
			return "error?database";
		}

		if (columnValue.equals(username)) {
			return "redirect:/register?error";
		}
		else {
			userService.save(theUser);
			roleService.save(theRole);
			return "redirect:/success";
		}
	}

	@RequestMapping("/success")
	public String success() {
		return "success";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/settings")
	public String settings() {
		return "settings";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
}
