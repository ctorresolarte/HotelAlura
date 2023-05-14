
package com.alura.hotelAlura.interfaces;

import com.alura.hotelAlura.models.Habitaciones;
import java.util.List;


public interface DAOhabitaciones {
    public void Registrar (Habitaciones huesped)throws Exception;
    public void Modificar (Habitaciones huesped)throws Exception;
    public void Eliminar (int habitacionID)throws Exception;
    public List<Habitaciones> Listar()throws Exception;
}
