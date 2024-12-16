package com.example.restHotel.restHotel.controller;

import com.example.restHotel.restHotel.model.Reserva;
import com.example.restHotel.restHotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    //GET
    @GetMapping
    public List<Reserva> listarReservas(){
        return  reservaService.getAllReservas();
    }

    //POST
    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva){
        return reservaService.createReserva(reserva);
    }

    //PUT
    @PutMapping("editar/{id}")
    public Reserva actualizarReserva(@RequestBody Reserva reserva, @PathVariable Long id){
        reserva.setIdReserva(id);
        return reservaService.updateReserva(reserva);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarReserva(@PathVariable Long id){
        reservaService.deleteReservaById(id);
    }
}
