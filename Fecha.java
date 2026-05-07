
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private int ddia;
    private int mmes;
    private int aanho;
    
    public Fecha(int dia, int mes, int anho) {
        assert esValida() == true : "dont be...";

        ddia = dia;
        mmes = mes;
        aanho = anho;
        
        
    }
        
        public boolean esBisiesto() {
        if (aanho % 4 != 0) {
            return false;
        }   else if (aanho % 100 != 0) {
            return true;
        }   else if (aanho % 400 == 0) {
            return true;
        }   else {
            return false;
            }
    }
    public int cantAnho(){
        if (esBisiesto() == true){
            return 366;
        }
        else {
            return 365;
        }
    }
    public boolean esValida(){
        
        if( aanho >= 1582 && ddia <= 31 && mmes <= 12)
        {
            return true;
        }
        else{
            return false;
            }
        }
    }
    