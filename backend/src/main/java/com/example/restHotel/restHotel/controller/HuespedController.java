package com.example.restHotel.restHotel.controller;

import com.example.restHotel.restHotel.model.Huesped;
import com.example.restHotel.restHotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huesped")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    //GET
    @GetMapping
    public List<Huesped> listarHuespedes(){
        return huespedService.getAllHuespedes();
    }

    //POST
    @PostMapping
    public Huesped crearHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    //PUT
    @PutMapping("editar/{id}")
    public Huesped actualizarHuesped(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarHuesped(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }

}
