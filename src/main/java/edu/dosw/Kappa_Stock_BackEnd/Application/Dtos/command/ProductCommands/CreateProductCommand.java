package edu.dosw.Kappa_Stock_BackEnd.Application.Dtos.command.ProductCommands;

import java.math.BigDecimal;

public record CreateProductCommand(
        String name,
        BigDecimal price,
        String description,
        String category,
        String imageUrl,
        Integer preparationTime
) {}