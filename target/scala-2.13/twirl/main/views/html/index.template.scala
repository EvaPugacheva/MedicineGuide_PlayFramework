
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>
    Medicine Guide
    </title>
  </head>
  <body>
    <header>
      <div>
        <ul>
          <li><a href="/medicines">Medicines</a></li>
          <li ><a href="/search">Search</a></li>
          <li ><a href="/articles">Articles</a></li>
          <li ><a href="/login">Login</a></li>
          <li ><a href="/registration">Registration</a></li>
        </ul>
      </div>
    </header>
    <div>
      <h1>Welcome to Medicine Guide!</h1>
      <div>
        <div>
          <div>
            <p>Here you can find information about different medicines and their categories<br><br>
              You can also search analogues of medicines by their active ingredients and read articles about health and medicine<br><br>
              <a href="/registration">Register</a> and <a href="/login">login</a>
              to write reviews on medicines and comment articles
              <br><br></p>
          </div>
          <div>
            <a href="/search"><button type="button">Explore medicines 🔍</button></a>
          </div>
        </div>
      </div>
    </div>
    <div>
      <small>Medicine Guide 2024</small>
    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 748be44eee7ebb6fe1d831c08a4df676bb2a7c16
                  MATRIX: 900->1|996->4
                  LINES: 27->1|32->2
                  -- GENERATED --
              */
          