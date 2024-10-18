package services;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import model.ABB;
import model.Node;
import org.springframework.stereotype.Service;

@Data
@Service
public class ABBService {
    private ABB abb;

    @PostConstruct
    public void init () {
        abb = new ABB();
    }

    public Node showKids(){
        return abb.getRoot();
    }
} //Fin de la clase
