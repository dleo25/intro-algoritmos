
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int anho;
    
    public Fecha(int ddia, int mmes, int aanho) {
        assert esValida();
        dia = ddia;
        mes = mmes;
        anho = aanho;
        
        
    }
        
    
        public boolean esBisiesto() {
        if (anho % 4 != 0) {
            return false;
        }   else if (anho % 100 != 0) {
            return true;
        }   else if (anho % 400 == 0) {
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
    
    private boolean esValida(){
        if( anho >= 1582 && dia <= 31 && mes <= 12)
        {
            return true;
        }
        else{
            return false;
            }
        }
    
    //consula que dado un mes nos diga cuantos dias tiene ese mes
    public int cantDiasMes(int mmes){
        if(mmes == 1 ||mmes == 3|| mmes == 5||mmes == 7||mmes == 8||mmes ==10||mmes == 12){
            return 31;
        }
        else if (mes == 4||mmes == 6||mmes == 9||mmes == 11){
            return 30;
        }
        else {
            return 28;
        }
    }    
}