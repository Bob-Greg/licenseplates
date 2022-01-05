import java.lang.Exception
import java.util.*

typealias int = Int
typealias string = String

object Main {
    private val stateLicensePlateMap = HashMap<string, Plate>()

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        while (true) {
            try {
                println("Enter a state name. Ex. 'California', 'california'")
                val state = sc.nextLine().lowercase()
                if (!stateLicensePlateMap.containsKey(state)) {
                    println("Enter a valid state name. Ex. 'california', 'California'")
                    continue
                }
                val plate = stateLicensePlateMap[state]!!.next()
                println(plate)
                println("Do you want to keep generating? (y/n)")
                var yn: string
                while (sc.next().lowercase().also { yn = it } != "y" && yn != "n") {
                    println("Enter a valid input. Ex. 'y', 'n'")
                }
                if (yn == "y") {
                    continue
                }
                break
            } catch (e: Exception) {
                println("Enter a valid state")
            }
        }
    }

    init {
        stateLicensePlateMap["alabama"] = Plate(CharElement.number, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["alaska"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["arizona"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["arkansas"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.letter)
        stateLicensePlateMap["california"] = Plate(CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["colorado"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["connecticut"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["delaware"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["florida"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["georgia"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["hawaii"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["idaho"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number).also { it.prefix = "1A" }
        stateLicensePlateMap["illinois"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["indiana"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["iowa"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["kansas"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["kentucky"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["louisiana"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["maine"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["maryland"] = Plate(CharElement.number, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["massachusetts"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["michigan"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["minnesota"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["mississippi"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["missouri"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.letter, CharElement.number, CharElement.letter)
        stateLicensePlateMap["montana"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.number)
        stateLicensePlateMap["nebraska"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["nevada"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.number, CharElement.number)
        stateLicensePlateMap["new hampshire"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["new jersey"] = Plate(CharElement.letter, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["new mexico"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["new york"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["north carolina"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["north dakota"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["ohio"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["oklahoma"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["oregon"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["pennsylvania"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["rhode island"] = Plate(CharElement.number, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["south carolina"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["south dakota"] = Plate(CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number).also { it.prefix = "0" }
        stateLicensePlateMap["tennessee"] = Plate(CharElement.number, CharElement.letter, CharElement.number, CharElement.number, CharElement.letter, CharElement.number)
        stateLicensePlateMap["texas"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["utah"] = Plate(CharElement.number, CharElement.letter, CharElement.number, CharElement.letter, CharElement.letter)
        stateLicensePlateMap["vermont"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["virginia"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["washington"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["west virginia"] = Plate(CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number).also { it.prefix = "8" }
        stateLicensePlateMap["wisconsin"] = Plate(CharElement.letter, CharElement.letter, CharElement.letter, CharElement.number, CharElement.number, CharElement.number, CharElement.number)
        stateLicensePlateMap["wyoming"] = Plate(CharElement.number, CharElement.number, CharElement.number, CharElement.number, CharElement.number).also { it.prefix = "0" }
    }
}