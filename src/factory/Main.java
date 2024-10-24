package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35);
		new PacientSymptomGUI(p1);
		
		Medicament m1 = new Medicament("Ibuprofeno");
		new MedicalGUI(m1);

	}

}
