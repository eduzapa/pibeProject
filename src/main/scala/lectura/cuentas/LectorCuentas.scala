package com.banco.cuenta
package lectura.cuentas

import lectura.Lector

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

trait LectorCuentas extends Lector{
   override def lecturaFichero(conexion: SparkSession, path: String):sql.DataFrame

}
