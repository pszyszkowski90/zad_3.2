package model;

public class Main {
	public static void main(String[] args) {
		Intern starzysta = new Intern("Janusz", "Jaki�", "1980-01-01");
		starzysta.setManager("Marcin B�k");
		starzysta.setScholarship(true);
		printWorker(starzysta);
		
		Worker pracownikFizyczny = new Worker("Marek", "W�ski", "1980-01-01");
		pracownikFizyczny.setManager("Marcin Nowak");
		pracownikFizyczny.setHourlyRate(20);
		pracownikFizyczny.setOvertime(20);
		pracownikFizyczny.setWorkedHours(168);
		pracownikFizyczny.AddSkill("Licencja na zabijanie");
		printWorker(pracownikFizyczny);
		
		WhiteCollar pracownikUmys�owy = new WhiteCollar("Marcin", "B�k", "1980-01-01");
		pracownikUmys�owy.setManager("Marcin Nowak");
		pracownikUmys�owy.setSalary(5000);
		pracownikUmys�owy.setPercentageBonus(15);
		pracownikUmys�owy.setPhoneNmber("123-456-789");
		pracownikUmys�owy.setRoomNumber(44);
		printWorker(pracownikUmys�owy);
		
		Manager kierownik = new Manager("Marcin", "Nowak", "1980-01-01");
		kierownik.setDepartment("Marketing");
		kierownik.setSalary(8000);
		kierownik.setPercentageBonus(15);
		kierownik.setManagerBonus(1200);
		kierownik.setPhoneNmber("123-456-789");
		kierownik.setMobilePhoneNmber("987-654-321");
		kierownik.setRoomNumber(44);
		printWorker(kierownik);
		
		BoardMember cz�onekRadyNadzorczej = new BoardMember("Marcin", "B�k", "1980-01-01");
		cz�onekRadyNadzorczej.setSalary(8000);
		cz�onekRadyNadzorczej.setAssistant("Nowak Janina");
		cz�onekRadyNadzorczej.setBoardMeetingCounter(5);
		printWorker(cz�onekRadyNadzorczej);
		
		
	}
	
	public static void printWorker(Employee worker) {
		worker.getInformation();
		System.out.println("Pensja to: " + worker.calculateSalary() + "\n");		
	}
}
