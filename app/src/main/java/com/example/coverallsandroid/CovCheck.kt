package com.example.coverallsandroid

class CovCheck {

    fun reverseString(input: String): String {
        return input.reversed()
    }

    fun isPalindrome(input: String): Boolean {
        return input == input.reversed()
    }

    fun capitalizeFirstLetter(input: String): String {
        return if (input.isNotEmpty()) {
            input[0].uppercaseChar() + input.substring(1)
        } else {
            input
        }
    }

    fun countVowels(input: String): Int {
        val vowels = "aeiouAEIOU"
        return input.count { it in vowels }
    }

    fun removeWhitespace(input: String): String {
        return input.replace(" ", "")
    }
}