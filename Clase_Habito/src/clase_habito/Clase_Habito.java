package clase_habito;

//@author edwar

public class Clase_Habito {

    
    public static void main(String[] args) {
    
        Habito habito1 = new Habito(
            1,
            "Hacer ejercicio",
            "Salud",
            "2025-09-01",
            "30 minutos de cardio",
            "Recuerda ejercitarte hoy a las 6 pm"
        );

        habito1.Marcar_habito();
        habito1.Brinda_recordatorio();
        habito1.Brindar_puntos();

        
        Habito habito2 = new Habito(
            2,
            "Dormir 8 horas",
            "Sueño",
            "2025-09-10",
            "Descansar bien todas las noches",
            "Ve a dormir antes de las 11 pm"
        );

     
        habito2.Marcar_habito();
        habito2.Brinda_recordatorio();
        habito2.Brindar_puntos();
    }
    
}
