 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {

/**
 * AQUÍ ESTAMOS DECLARANDO LAS VARIABLES
 * @author Sergio
 * @version 1.0.0
 */
     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructor sin parametros
 */
  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Numero de cuenta
    * @param sal Dinero en la cuenta
    * @param tipo Tipo de cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Asigna el nombre del titular de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return nombre del titular de la cuenta 
    */
    public String obtenerNombre()
    {
        return nombre;
    }
    
    /**
     * 
     * @return saldo del saldo que tiene la cuenta
     */
    
     public double estado ()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad Cantidad de dinero
 * @throws Exception para evitar el colapso del programa
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad Cantidad de dinero a meter en la cuenta
    * @throws Exception Para evitar que el programa colapse
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return Devuelve el numero de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta Cuenta corriente
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
/**
 * 
 * @param saldo Cantidad de dinero en la cuenta
 */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return Devuelve el tipo de interes 
  */
  public double getTipoInterés() {
    return tipoInterés;
  }
/**
 * 
 * @param tipoInterés Interes que genera el dinero en la cuenta
 */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}