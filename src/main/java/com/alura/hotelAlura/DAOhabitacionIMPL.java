package com.alura.hotelAlura;

import com.alura.hotelAlura.conexionDB.ConnectionDB;
import com.alura.hotelAlura.interfaces.DAOhabitaciones;
import com.alura.hotelAlura.models.Habitaciones;
import com.mysql.cj.protocol.Resultset;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOhabitacionIMPL extends ConnectionDB implements DAOhabitaciones {

    @Override
    public void Registrar(Habitaciones habitacion) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("INSERT INTO habitaciones(fecha_ingreso, fecha_salida, tipo_habitacion, cant_habitaciones, forma_pago, valor)values(?,?,?,?,?,?)");
            st.setDate(1, (Date) habitacion.getFecha_ingreso());
            st.setDate(2, (Date) habitacion.getFecha_salida());
            st.setString(3, habitacion.getTipo_habitacion());
            st.setInt(4,habitacion.getCant_habitaciones());
            st.setString(5, habitacion.getForma_pago());
            st.setInt(6, habitacion.getValor());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Desconectar();
        }
    }

    @Override
    public void Modificar(Habitaciones habitacion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(int habitacionID) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("delete from habitaciones where id_habitacion = ?;");
            st.setInt(1, habitacionID);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Desconectar();
        }
    }

    @Override
    public List<Habitaciones> Listar() throws Exception {
        List<Habitaciones> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("select * from habitaciones;");
       
            lista = new ArrayList();
              ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Habitaciones habitacion = new Habitaciones();
                habitacion.setId_habitacion(rs.getInt("id_habitacion"));
                habitacion.setId_cliente(rs.getInt("id_cliente"));
                habitacion.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                habitacion.setFecha_salida(rs.getDate("fecha_salida"));
                habitacion.setTipo_habitacion(rs.getString("tipo_habitacion"));
                habitacion.setCant_habitaciones(rs.getInt("cant_habitaciones"));
                habitacion.setForma_pago(rs.getString("forma_pago"));
                habitacion.setValor(rs.getInt("valor"));
                lista.add(habitacion);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Desconectar();
        }
        return lista;
    }

   
}
