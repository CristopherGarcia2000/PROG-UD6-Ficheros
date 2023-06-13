package actividades.cuatro;

import java.io.Serializable;

public class Mesa implements Serializable {
    String color;
    int numPatas;

    public Mesa(String color, int numPatas) {
        this.color = color;
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "La mesa es de color "+color+" y tiene "+numPatas+" patas";
    }
}
