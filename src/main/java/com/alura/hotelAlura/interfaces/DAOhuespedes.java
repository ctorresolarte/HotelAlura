package com.alura.hotelAlura.interfaces;

import com.alura.hotelAlura.models.Huespedes;
import java.util.List;

public interface DAOhuespedes {
    public void Registrar (Huespedes huesped)throws Exception;
    public void Modificar (Huespedes huesped)throws Exception;
    public void Eliminar (int  huespedID)throws Exception;
    public List<Huespedes> Listar()throws Exception;
    public Huespedes getHuespedesById(int huespedId)throws Exception;
}
