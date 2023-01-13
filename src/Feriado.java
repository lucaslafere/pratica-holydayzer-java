import java.util.ArrayList;
import java.util.List;


public class Feriado {
    String data;
    String name;
    List<String> todosFeriados = new ArrayList<>();
    public Feriado (String data, String name) {
        todosFeriados.add(data);
        this.data = data;
        this.name = name;
    }
    public String getFeriado (String data) {
        int index = todosFeriados.indexOf(data);
        return todosFeriados.get(index);
    }
    public List<String> getTodosFeriados () {
        return todosFeriados;
    }
}
