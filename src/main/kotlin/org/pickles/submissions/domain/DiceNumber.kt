package org.pickles.submissions.domain

fun calc(face: Int): Int {
    if(face < 1 || face > 6) throw IllegalArgumentException()
    return 7 - face
}