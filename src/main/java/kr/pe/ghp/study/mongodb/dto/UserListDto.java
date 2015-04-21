package kr.pe.ghp.study.mongodb.dto;

import java.util.List;

import kr.pe.ghp.study.mongodb.domain.User;

public class UserListDto {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
