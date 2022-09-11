import java.util.Scanner
abstract class Shape (_name : String) : Dimensionable {
    var name = _name

    fun getArea(): Double {
        return 0.0;
    }

    fun setDimensions(args: Array<String>) {
        val reader = Scanner(System.`in`)


        //Square
        print("Enter width followed by height for a square./nWidth:  ")
        var width:Int = reader.nextInt()
        print("Length: ")
        var height:Int = reader.nextInt()
        val square = Square(height, width)

        //Circle
        print("Enter radius for a circle./nRadius:  ")
        var radius:Int = reader.nextInt()
        val circle = Circle(radius)

        //Triangle
        print("Enter 3 sides for triangle./nSide 1:  ")
        var side1:Int = reader.nextInt()
        print("Side 2: ")
        var side2:Int = reader.nextInt()
        print("Side 3: ")
        var side3:Int = reader.nextInt()
        val traingle = Triangle(side1, side2, side3)

        //EqualateralTriangle
        print("Enter the side length of an equilateral triangle./nSides Length:  ")
        var equalSide:Int = reader.nextInt()
        val equalTraingle = EquilateralTriangle(equalSide)
    }


    private fun print(s: String) {


    }


}
