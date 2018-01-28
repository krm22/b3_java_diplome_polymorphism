package ecole;

public class Project extends Examen {
	
	 public void setNote( double noteEcrite, int noteOrale) {
		 setApprieciationNote( noteEcrite );
		 setApprieciationNote( noteOrale );
		 this.note = (noteEcrite + noteOrale);
	 }
	 
	
	public String setApprieciationNote( double noteEcrite)
	 {
	     if ( noteEcrite < 5 ) {
		       this.apprieciation =   " Project Ecrite : insufficient";
		         } else if ( noteEcrite >= 5  && noteEcrite <= 7){
		         this.apprieciation =  " Project Ecrite  :passable ";  
		         } else if ( noteEcrite >= 7 && noteEcrite <= 8){
		           this.apprieciation = " Project Ecrite  : good ";  
		          } else {
		                this.apprieciation =  " noteOrale : very good "; 
		           }
	     return this.apprieciation ;
     }
	
	
	
	@Override
	public String setApprieciationNote( int  noteOrale)
	 {
	     if ( noteOrale  < 5 ) {
		       this.apprieciation =   " Project Orale : insufficient";
		         } else if ( noteOrale >= 5  && noteOrale <= 7  ){
		         this.apprieciation =  " Project Orale  :passable ";  
		         } else if (  noteOrale >= 7 && noteOrale <= 8){
		           this.apprieciation = " Project Orale  : good ";  
		          } else {
		                this.apprieciation =  " noteOrale : very good "; 
		           }
	     return this.apprieciation ;
    }
	           
	 



};
	
	

	

