package dev.java.CadastroDePiratas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PirataController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Rota Criada";
    }


}
