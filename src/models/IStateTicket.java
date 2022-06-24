/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author JeroJimenez
 */
public interface IStateTicket {
   public void activar();
   public void pausar();
   public void cancelar();
   public void finalizar();
   public String toString();
}
