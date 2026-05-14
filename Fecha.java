
public class Fecha
{
    private int dia;
    private int mes;
    private int anho;
    
    public Fecha(int ddia, int mmes, int aanho) {
        
        assert esValida(ddia, mmes, aanho);
        
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
    
    private boolean esValida(int ddia, int mmes, int aanho){
        if( aanho >= 1582 && aanho <= 2026 && ddia <= 31 && mmes <= 12)
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
        else if (mmes == 4||mmes == 6||mmes == 9||mmes == 11){
            return 30;
        }
        else {
            if(esBisiesto()){
                return 29;
            }
            else {
                return 28;
            }
        }
    }    
    
    public void cambiarDia(int nuevoDia){
        assert esValida(nuevoDia, mes, anho);
        dia = nuevoDia;
    }
    
    public void cambiarMes(int nuevoMes){
        assert esValida(dia, nuevoMes, anho);
        mes = nuevoMes;
    }
    
    public void cambiarAño(int nuevoAño){
        assert esValida(dia, mes, nuevoAño);
        anho = nuevoAño;
    }
    
    public int obtenerDia(){
        return dia;
    }
    
    public int obtenerMes(){
        return mes;
    }
    
    public int obtenerAño(){
        return anho;
    }
    
    public String obtenerFecha(){
        return dia + "/" + mes + "/" + anho;
    }
    
    public boolean equals(Fecha otraFecha){
        if (dia == otraFecha.obtenerDia()){
            if (mes == otraFecha.obtenerMes()){
                if (anho == otraFecha.obtenerAño()){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}