package springtutorial;

public class Application {

	private UsersRepository usersRpository;
	private DictonaryRepository dictonaryRepository;
	
	
	public Application(UsersRepository usersRpository, DictonaryRepository dictonaryRepository) {
		this.usersRpository = usersRpository;
		this.dictonaryRepository = dictonaryRepository;
	}
	
	public UsersRepository getUsersRpository() {
		return usersRpository;
	}
//
//	public void setUsersRpository(UsersRepository usersRpository) {
//		this.usersRpository = usersRpository;
//	}
//
	public DictonaryRepository getDictonaryRepository() {
		return dictonaryRepository;
	}
//
//	public void setDictonaryRepository(DictonaryRepository dictonaryRepository) {
//		this.dictonaryRepository = dictonaryRepository;
//	}

}
