package com.banco.cuenta
package validar.implementacion

import validar.Validar

import org.apache.spark.sql.DataFrame

object ValidarImplementacion extends Validar{

  override def validarCuenta(cuenta: String, cuentasDataFrame: DataFrame): Boolean = ???

  override def validarSucursal(idSucursal: String, sucursales: DataFrame): Boolean = ???
}
