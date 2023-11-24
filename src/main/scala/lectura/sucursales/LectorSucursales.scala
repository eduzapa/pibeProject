package com.banco.cuenta
package lectura.sucursales

import lectura.Lector

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

trait LectorSucursales extends Lector{
  override def lecturaFichero(conexion: SparkSession, path: String):sql.DataFrame

}
