package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;

public interface SacolaService {
    Sacola verSacola(Long id);

    Sacola fecharSacola(Long id, int FormaPagamento);

    Item incluirItemNaSacola(ItemDto itemDto);

    
}
