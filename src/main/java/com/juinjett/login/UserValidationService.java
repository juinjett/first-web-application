package com.juinjett.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	public boolean isUserVaild(String user, String password) {
		if (user.equals("juinjett") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
