
import javax.persistence.*;
import java.util.Set;

@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "marca")
    private Carro carro;

    // Construtores, getters e setters
}
