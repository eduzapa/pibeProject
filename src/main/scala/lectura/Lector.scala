package com.banco.cuenta
package lectura

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

trait Lector {

  def lecturaFichero(conexion: SparkSession, path: String): sql.DataFrame

}
