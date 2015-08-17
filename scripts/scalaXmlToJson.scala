import net.liftweb.json._
import net.liftweb.json.JsonAST._

//Script taken from https://mkaz.com/2011/05/23/how-to-convert-xml-to-json/
//this uses lift-json_2.10-2.5.3.jar as a dependency
val xmlData = xml.XML.loadFile("../data/raw/application.xml")
val str = Printer.pretty(render(Xml.toJson(xmlData)))

var out_file = new java.io.FileOutputStream("../data/raw/application.json")
var out_stream = new java.io.PrintStream(out_file)

out_stream.print(str)
out_stream.close