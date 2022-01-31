package org.basic.ecommerce.service;

import java.util.List;

import org.basic.ecommerce.dto.UserDetailDTO;

public interface UserService {
	public List<UserDetailDTO> getAllUsers();
}
