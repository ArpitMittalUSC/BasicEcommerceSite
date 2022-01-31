package org.basic.ecommerce.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.basic.ecommerce.dto.UserDetailDTO;
import org.basic.ecommerce.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<UserDetailDTO> getAllUsers() {
		List<UserDetailDTO> users = new ArrayList<UserDetailDTO>();
		users.add(new UserDetailDTO("User1", "Buyer", "U001"));
		users.add(new UserDetailDTO("User2", "Buyer", "U002"));
		users.add(new UserDetailDTO("User3", "Seller", "U003"));
		users.add(new UserDetailDTO("User4", "Seller", "U004"));
		return users;
	}

}
