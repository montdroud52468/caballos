package ejemplo208;
public class RecursoCompartido {
    
    private boolean Falgwinner = false;
    private String nameWinner="";
    
    
    

    public synchronized boolean isFalgwinner() {
        return Falgwinner;
    }

    public synchronized void setFalgwinner(boolean Falgwinner) {
        this.Falgwinner = Falgwinner;
    }

    public String getNameWinner() {
        return nameWinner;
    }

    public synchronized void setNameWinner(String nameWinner) {
        if(!isFalgwinner()){
        this.nameWinner = nameWinner;
        Falgwinner = true;
            System.out.println("El ganador es: "+nameWinner);
        }
        else{
            System.out.println("Soy "+nameWinner+", Ya gano otro");
        }
    }
   
    
}
