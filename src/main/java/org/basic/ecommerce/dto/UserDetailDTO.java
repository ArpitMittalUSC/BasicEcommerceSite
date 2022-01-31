package org.basic.ecommerce.dto;

public class UserDetailDTO {

	private boolean active;
	private String name;
	private String role;
	private String email;
	private String id;
	private String phone;
	
	public UserDetailDTO() {
		super();
	}

	public UserDetailDTO(String name, String role, String id) {
		super();
		this.name = name;
		this.role = role;
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
