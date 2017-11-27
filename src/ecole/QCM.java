package ecole;

public class QCM extends Examen {
	
	private int numOfQuestions;
	private int nbReponsesCorrectes;
	private static final int bareme = 20;

	public QCM(int numOfQuestions) {
	    this.numOfQuestions = numOfQuestions;
	}

	
	public void setResponsesCorrecte(int nbReponsesCorrectes) {
		this.nbReponsesCorrectes = nbReponsesCorrectes;
		this.computeNote();
	}
	
	private void computeNote(){
		 this.note = (double)this.nbReponsesCorrectes / (double)this.numOfQuestions * (double)bareme;
	}

}