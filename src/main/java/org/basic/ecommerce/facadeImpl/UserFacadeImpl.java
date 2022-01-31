package org.basic.ecommerce.facadeImpl;

import java.util.List;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.UserDetailDTO;
import org.basic.ecommerce.facade.UserFacade;
import org.basic.ecommerce.service.UserService;

public class UserFacadeImpl implements UserFacade {
	@Resource(name = "userService")
	private UserService userService;

	@Override
	public List<UserDetailDTO> getAllUsers() {
		return userService.getAllUsers();
	}
}
