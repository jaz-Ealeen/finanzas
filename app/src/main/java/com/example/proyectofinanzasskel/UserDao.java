package com.example.proyectofinanzasskel;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM usermodel")
    List<UserModel> Traertodos();

    @Query("SELECT * FROM usermodel WHERE uid IN (:userIds)")
    List<UserModel> Traertodosporid(int[] userIds);




    @Query("SELECT * FROM usermodel WHERE correo LIKE :correo AND " +
            "contrasenia LIKE :contrasenia LIMIT 1")
    boolean Buscarlogin(String correo, String contrasenia);


    @Query("SELECT * FROM usermodel WHERE correo LIKE :correo")
    boolean Buscarregistro(String correo);

    @Query("SELECT * FROM usermodel WHERE correo LIKE :correo AND " +
            "contrasenia LIKE :contrasenia LIMIT 1")

    UserModel traer(String correo, String contrasenia);


    @Query("SELECT * FROM usermodel WHERE uid LIKE :id")
    UserModel traerporid(Integer id);

    @Insert
    void Insertartodos(UserModel... users);

    @Update
    void actualizar(UserModel user);
    @Insert
    void Insertar(UserModel user);

    @Delete
    void Borrartodos(UserModel... users);

    @Delete
    void Borrar(UserModel user);

}