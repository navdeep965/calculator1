import java.util.*
        fun main(args: Array<String>)
        {
            val read = Scanner(System.`in`)
            println("Enter any two numbers-")
            val num = read.nextDouble()
            val number = read.nextDouble()
            println("Enter any operator out of given five operators(+,-,*,/,%)")
            val res = when (val ope = readLine()) {
                "+" -> num + number
                "-" -> num - number
                "*" -> num * number
                "/" -> num / number
                "%" -> num % number
                else -> "$ope wrong operator entered"
            }
            println("result=$res")
        }


