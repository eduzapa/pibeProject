package com.banco.cuenta
package conexiones

import java.sql.Connection

trait ConexionBBDD {
  def getConnection():Connection
  def closeConnection(connection: Connection):Unit

}
