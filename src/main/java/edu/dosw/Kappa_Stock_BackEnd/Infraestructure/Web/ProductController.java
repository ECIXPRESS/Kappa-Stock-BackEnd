package edu.dosw.Kappa_Stock_BackEnd.Infraestructure.Web;


import edu.dosw.Kappa_Stock_BackEnd.Application.Dtos.ProductRequest;
import edu.dosw.Kappa_Stock_BackEnd.Application.Dtos.ProductResponse;
import edu.dosw.Kappa_Stock_BackEnd.Application.Dtos.command.ProductCommands.CreateProductCommand;
import edu.dosw.Kappa_Stock_BackEnd.Application.Services.ProductUseCases.CreateProductUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductUseCase createProductUseCase;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(
            @Valid @RequestBody ProductRequest request) {

        CreateProductCommand command = CreateProductCommand.fromRequest(request);
        ProductResponse response = createProductUseCase.createProduct(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
