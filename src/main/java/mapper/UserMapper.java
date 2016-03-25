package mapper;

import domain.User;

	public interface UserMapper {
		User selectUser(String username);
	}
