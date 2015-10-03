import com.mongodb.casbah.MongoClient
import play.api.libs.json.Json

object Main {
  def main(args: Array[String]): Unit = {
    val client = MongoClient()
    val db = client("zoomo")
    //db.collectionNames().foreach(println)
    val carClassifieds = db("car_classifieds")
    val carOption = carClassifieds.headOption
    val carJsonOption = carOption.map(item => Json.prettyPrint(Json.parse(item.toString)))
    println(carJsonOption.getOrElse("nothing"))
  }
}
