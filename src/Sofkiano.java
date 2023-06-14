import java.util.Objects;

public class Sofkiano implements Observer{
    private String name;


    public Sofkiano(String name) {
        this.name = name;
    }

    @Override
    public void update(String param) {
        System.out.println(name + ": el nuevo menu de comidas: " + param + " ha sido preparado, ya puedes ir a comer");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Comensal{" +
                "name='" + name + '\'' +
                '}';
    }
}
