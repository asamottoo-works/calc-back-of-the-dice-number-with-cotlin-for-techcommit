package org.pickles.submissions

import org.pickles.submissions.domain.calc

fun main(args: Array<String>) {
    print("サイコロの目を入力してください。（数字は1-6にして下さい。）\n> ")
    var first: Int = readLine()?.toInt() ?: 0
    var result = calc(first)
    println("サイコロの裏の目は${result}です。")
}