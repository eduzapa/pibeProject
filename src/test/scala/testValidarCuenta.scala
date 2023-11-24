package com.banco.cuenta
import org.scalatest.funsuite.AnyFunSuiteLike

class pruebasTest extends AnyFunSuiteLike {

  test("Cuenta valida con espacios") {
    assert(pruebas.validateAccountNumber("ES00 0000 0000 00 0000000000"))
  }
  test("Cuenta valida sin espacios") {
    assert(pruebas.validateAccountNumber("ES0000000000000000000000"))
  }
  test("Cuenta no valida codigo pais no valido") {
    assert(!pruebas.validateAccountNumber("AB00 0000 0000 00 0000000000"))
  }
  test("Longitud no valida (menor 24 caracteres)") {
    assert(!pruebas.validateAccountNumber("ES0000"))
  }

  test("Caracteres no válidos en IBAN") {
    assert(!pruebas.validateAccountNumber("ES00 0000 0000 00 A000000000"))
  }

}