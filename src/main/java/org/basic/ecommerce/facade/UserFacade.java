package org.basic.ecommerce.facade;

import java.util.List;

import org.basic.ecommerce.dto.UserDetailDTO;

public interface UserFacade {
	public List<UserDetailDTO> getAllUsers();
}
