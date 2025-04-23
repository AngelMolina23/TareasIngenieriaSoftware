package cmx.unam.aragon.ico.autos_api.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "automoviles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Automovil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String color;
    private String foto;

}
