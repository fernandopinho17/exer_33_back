import javax.persistence.*;

@Entity
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    // Construtores, getters e setters
}
