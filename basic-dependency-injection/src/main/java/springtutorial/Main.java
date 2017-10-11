package springtutorial;

import springtutorial.api.Logger;
import springtutorial.api.UsersRepository;
import springtutorial.domain.User;
import springtutorial.implementations.LoggerImpl;
import springtutorial.implementations.UsersRepositoryImpl;


public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);;
		
		User user = usersRepository.createUser("janek");
	}

}
