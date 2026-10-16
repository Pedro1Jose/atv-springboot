package biblioteca.biblioteca.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@Table(name = "tb_livro")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    // cada edição tem seu próprio ISBN
    @Column(name = "ds_isbn", nullable = false, unique = true)
    @JsonProperty("isbn")
    private String isbn;

    @Column(name = "ds_titulo", nullable = false)
    @JsonProperty("titulo")
    private String titulo;

    @Column(name = "nr_ano", nullable = false)
    @JsonProperty("ano")
    private Integer ano;

    @Column(name = "nr_edicao", nullable = false)
    @JsonProperty("edicao")
    private Integer edicao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_autor", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Autor autor;
}
