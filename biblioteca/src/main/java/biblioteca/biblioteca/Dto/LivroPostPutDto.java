package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    @JsonProperty("isbn")
    @NotBlank(message = "ISBN do livro não pode ser vazio")
    private String isbn;

    @JsonProperty("titulo")
    @NotBlank(message = "Título do livro não pode ser vazio")
    private String titulo;

    @JsonProperty("ano")
    @NotNull(message = "Ano do livro não pode ser vazio")
    @Positive(message = "Ano do livro deve ser positivo")
    private Integer ano;

    @JsonProperty("edicao")
    @NotNull(message = "Edição do livro não pode ser vazia")
    @Positive(message = "Edição do livro deve ser positiva")
    private Integer edicao;

    @JsonProperty("autorId")
    @NotNull(message = "Autor do livro não pode ser vazio")
    private Long autorId;
}
