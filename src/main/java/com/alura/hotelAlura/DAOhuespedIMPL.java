package com.alura.hotelAlura;

import com.alura.hotelAlura.conexionDB.ConnectionDB;
import com.alura.hotelAlura.interfaces.DAOhuespedes;
import com.alura.hotelAlura.models.Huespedes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOhuespedIMPL extends ConnectionDB implements DAOhuespedes {

    @Override
    public void Registrar(Huespedes huesped) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("INSERT INTO huespedes (nombre, apellido, tipo_documento, num_documento, telefono, nacionalidad) values(?,?,?,?,?,?)");
            st.setString(1, huesped.getNombre());
            st.setString(2, huesped.getApellido());
            st.setString(3, huesped.getTipo_documento());
            st.setString(4, huesped.getNumero_documento());
            st.setString(5, huesped.getNumtelefono());
            st.setString(6, huesped.getNacionalidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Desconectar();
        }
    }

    @Override
    public void Modificar(Huespedes huesped) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(int huespedID) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("delete from huespedes where id_cliente = ?;");
            st.setInt(1, huespedID);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Desconectar();
        }
    }

    @Override
    public List<Huespedes> Listar() throws Exception {
        List<Huespedes> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("select * from huespedes;");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Huespedes huesped = new Huespedes();
                huesped.setId_cliente(rs.getInt("id_cliente"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setTipo_documento(rs.getString("Tipo_documento"));
                huesped.setNumero_documento(rs.getString("num_documento"));
                huesped.setNumtelefono(rs.getString("telefono"));
                huesped.setNacionalidad(rs.getString("nacionalidad"));
                lista.add(huesped);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Desconectar();
        }
        return lista;
    }

    @Override
    public Huespedes getHuespedesById(int huespedId) throws Exception {
        Huespedes huesped = new Huespedes();

        try {
            this.Conectar();
            PreparedStatement st = this.con.prepareStatement("select * from huespedes where id_cliente = ?;");
            st.setInt(1, huespedId);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                huesped.setId_cliente(rs.getInt("id_cliente"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setTipo_documento(rs.getString("Tipo_documento"));
                huesped.setNumero_documento(rs.getString("num_documento"));
                huesped.setNumtelefono(rs.getString("telefono"));
                huesped.setNacionalidad(rs.getString("nacionalidad"));
            }
            rs.close();
            st.close();
        } catch (Exception e) { 
            throw e;
        } finally {
            this.Desconectar();
        }
        return huesped;
    }

}
