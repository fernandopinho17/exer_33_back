import javax.persistence.*;
import java.util.Set;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    private Marca marca;

    @OneToMany(mappedBy = "carro", cascade = CascadeType.ALL)
    private Set<Acessorio> acessorios;

    // Construtores, getters e setters
}