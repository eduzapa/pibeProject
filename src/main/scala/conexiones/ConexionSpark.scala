package com.banco.cuenta
package conexiones

import org.apache.spark.sql.SparkSession

trait ConexionSpark {
  def getConnection(): SparkSession

  def closeConnection(conexion: SparkSession):Unit
}
