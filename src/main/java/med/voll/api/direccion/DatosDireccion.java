package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public record DatosDireccion (

        @NotBlank
        String calle,

        @NotBlank
        String distrito,

        @NotBlank
        String cuidad,

        @NotBlank
        String numero,

        @NotBlank
        String complemento){


}

