package entities;

public class Student {
	
	public String nome;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalNote() {
		return note1 + note2 + note3;
	}
	
	public double missing() {
		if (finalNote() < 60.0) {
			return 60.0 - finalNote();
		}
		else {
			return 0.0;
		}
		
	}

}
