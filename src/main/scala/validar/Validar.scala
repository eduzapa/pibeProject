package com.banco.cuenta
package validar

import org.apache.spark.sql

trait Validar {

  def validarCuenta(cuenta:String,cuentasDataFrame:sql.DataFrame): Boolean

  def validarSucursal(idSucursal:String,sucursales:sql.DataFrame): Boolean


}
