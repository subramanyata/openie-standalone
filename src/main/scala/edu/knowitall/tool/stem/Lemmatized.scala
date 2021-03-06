package edu.knowitall
package tool
package stem

import tool.tokenize.Token
import scala.language.implicitConversions

case class Lemmatized[+T <: Token](token: T, lemma: String)

object Lemmatized {
  implicit def viewAsToken[T <: Token](lemmatized: Lemmatized[T]) = lemmatized.token
}
