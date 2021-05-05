package comida;

public class Eyeholes extends Cereales{

    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 25f;

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    }
}
