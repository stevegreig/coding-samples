import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the countingValleys function below.
    def countingValleys(n: Int, s: String): Int = {
        var seaLevel = 0
        var valleyCount = 0
        
        s.foreach(step => { 
            if (step == 'D') seaLevel -= 1
            else seaLevel += 1
            if (step == 'U' && seaLevel == 0)
                valleyCount += 1
        })

        valleyCount
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val s = stdin.readLine

        val result = countingValleys(n, s)

        printWriter.println(result)

        printWriter.close()
    }
}
