package com.banco.cuenta
package lectura.sucursales.implementaciones

import lectura.sucursales.LectorSucursales

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

object LectorSucursalesJSON extends LectorSucursales{
  override def lecturaFichero(conexion: SparkSession, path: String):sql.DataFrame = ???
