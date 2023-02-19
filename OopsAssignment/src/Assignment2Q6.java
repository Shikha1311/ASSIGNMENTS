abstract class Persistence {
	abstract public String persist();
}

class FilePersistence extends Persistence {
	@Override
	public String persist() {
		return "Data Entered in FilePersistence.";
	}
}

class DatabasePersistence extends Persistence {
	@Override
	public String persist() {
		return "Data Entered in DataPersistence.";

	}
}

public class Assignment2Q6 {
	public static void main(String[] args) {
		Persistence p = new DatabasePersistence();
		System.out.println(p.persist());
		p = new FilePersistence();
		System.out.println(p.persist());

	}
}