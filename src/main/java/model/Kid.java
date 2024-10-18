package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kid {
    private int id;
    private String data;

    public Kid(int id, String data) {
        this.id = id;
        this.data = data;
    }
} //Fin de la clase
