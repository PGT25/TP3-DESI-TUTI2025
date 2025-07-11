package com.tp.desi2025.servicios;

import com.tp.desi2025.accesoDatos.EntregaAlimentoRepository;
import com.tp.desi2025.entidades.EntregaAlimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaAlimentoService {

    @Autowired
    private EntregaAlimentoRepository entregaAlimentoRepository;

    public void guardar(EntregaAlimento entrega) {
        entregaAlimentoRepository.save(entrega);
    }

    public List<EntregaAlimento> listarTodas() {
        return entregaAlimentoRepository.findAll();
    }

    public EntregaAlimento buscarPorId(Long id) {
        return entregaAlimentoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        entregaAlimentoRepository.deleteById(id);
    }
}
