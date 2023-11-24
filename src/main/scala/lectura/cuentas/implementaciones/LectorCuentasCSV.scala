package com.banco.cuenta
package lectura.cuentas.implementaciones

import lectura.cuentas.LectorCuentas

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

object LectorCuentasCSV extends LectorCuentas{
  override def lecturaFichero(conexion: SparkSession, path: String):sql.DataFrame = ???