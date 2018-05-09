package model;

public class Main {
	public static void main(String[] args) {
		Intern starzysta = new Intern("Janusz", "Jakiœ", "1980-01-01");
		starzysta.setManager("Marcin B¹k");
		starzysta.setScholarship(true);
		printWorker(starzysta);
		
		Worker pracownikFizyczny = new Worker("Marek", "W¹ski", "1980-01-01");
		pracownikFizyczny.setManager("Marcin Nowak");
		pracownikFizyczny.setHourlyRate(20);
		pracownikFizyczny.setOvertime(20);
		pracownikFizyczny.setWorkedHours(168);
		pracownikFizyczny.AddSkill("Licencja na zabijanie");
		printWorker(pracownikFizyczny);
		
		WhiteCollar pracownikUmys³owy = new WhiteCollar("Marcin", "B¹k", "1980-01-01");
		pracownikUmys³owy.setManager("Marcin Nowak");
		pracownikUmys³owy.setSalary(5000);
		pracownikUmys³owy.setPercentageBonus(15);
		pracownikUmys³owy.setPhoneNmber("123-456-789");
		pracownikUmys³owy.setRoomNumber(44);
		printWorker(pracownikUmys³owy);
		
		Manager kierownik = new Manager("Marcin", "Nowak", "1980-01-01");
		kierownik.setDepartment("Marketing");
		kierownik.setSalary(8000);
		kierownik.setPercentageBonus(15);
		kierownik.setManagerBonus(1200);
		kierownik.setPhoneNmber("123-456-789");
		kierownik.setMobilePhoneNmber("987-654-321");
		kierownik.setRoomNumber(44);
		printWorker(kierownik);
		
		BoardMember cz³onekRadyNadzorczej = new BoardMember("Marcin", "B¹k", "1980-01-01");
		cz³onekRadyNadzorczej.setSalary(8000);
		cz³onekRadyNadzorczej.setAssistant("Nowak Janina");
		cz³onekRadyNadzorczej.setBoardMeetingCounter(5);
		printWorker(cz³onekRadyNadzorczej);
		
		
	}
	
	public static void printWorker(Employee worker) {
		worker.getInformation();
		System.out.println("Pensja to: " + worker.calculateSalary() + "\n");		
	}
}
