package ecole;

public class Project extends Examen {
	
	public void setNote(int noteEcrite, int noteOrale) {
		this.note = (noteEcrite + noteOrale);
	}
	
}
