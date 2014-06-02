package App

import org.json4s._
import org.json4s.jackson.JsonMethods._
// object_to_json_string
import org.json4s.JsonDSL.WithBigDecimal._

object Json2Obj {

	case class Account(id: Long, nick: String, item: List[Int])

	def printAccount(acc: Account) = {
		println("ID=" + acc.id, "Nick=" + acc.nick, "Item=" + acc.item)
	}

	def json_string_to_object() {
		implicit val formats = org.json4s.DefaultFormats

		var json = parse("""{"id":123, "nick":"test", "item" : [4,5,6] }""")
		println(json)

		var account = json.extract[Account]
		printAccount(account)
	}

	def object_to_json_string() {
		var account = Account(123, "test", List(4, 5, 6))
		println(account)

		var jsonString = render(account.toString())

		// JString 
		println(jsonString)

		// 순수 string 
		println(compact(jsonString))
	}

	def main(args: Array[String]): Unit = {
		json_string_to_object()
		object_to_json_string()
	}

}
