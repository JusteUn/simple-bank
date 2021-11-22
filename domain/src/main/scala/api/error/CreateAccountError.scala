package fr.fpe.school
package api.error

sealed trait CreateAccountError

case class LenghtError(msg: String) extends CreateAccountError

case class BlankError(msg: String) extends CreateAccountError
