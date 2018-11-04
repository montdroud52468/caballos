package ejemplo208;

import java.util.Random;
import javax.swing.JLabel;

public class Corredor implements Runnable {
    private int ancho=0;
    JLabel label;
    RecursoCompartido recursoCompartido;
    @Override
    public void run() {
        int vueltas = 0;
        Random r = new Random(System.nanoTime());
        int avance = 0;
        while (avance < ancho) {
            if (recursoCompartido.isFalgwinner()) {
            
            }
            if(r.nextInt(100)<50){
                avance++;
            }else{
                avance+=0;
            }
            label.setLocation(avance, label.getY());
            try {
                Thread.sleep(10 + r.nextInt(100));
                } catch (InterruptedException ex) {
            }
        }
        recursoCompartido.setNameWinner(label.getText());
    }

    public Corredor(JLabel label) {
        this.label = label;
        if(label.getLocation().x==500){
            System.out.println("Eduardo");
        }
    }

    public Corredor(JLabel label, RecursoCompartido recursoCompartido,int ancho) {
        this(label);
        this.ancho=ancho;
        this.recursoCompartido = recursoCompartido;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void stop(){
        
    }
    

}
