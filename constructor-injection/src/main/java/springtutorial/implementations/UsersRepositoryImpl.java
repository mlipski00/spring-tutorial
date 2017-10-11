package springtutorial.implementations;

import springtutorial.api.Logger;
import springtutorial.api.UsersRepository;
import springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public UsersRepositoryImpl(Logger logger, String localization) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization);
	}

	public User createUser(String name) {
		 logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}



}
