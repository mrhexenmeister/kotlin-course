package org.example.com.stimmax.kotlincourse.lessons.lesson17.homeworks

class GamingMachine(
    val model: String,
    val color: String,
    var owner: String,
    var supportPhone: String,
    val gameSessionCost: Double, // Например, 50.50
    val installedGames: List<String>,
    val hasJoystick: Boolean,
    private val pinCode: String // Пин-код точно не должен быть виден снаружи!
) {
    private var isTurnedOn: Boolean = false
        private set

    private var isOsLoaded: Boolean = false
        private set

    private var isSessionPaid: Boolean = false
        private set

    private var cashBalance: Double = 0.0
        private set

    fun turnOn() {
        if (!isTurnedOn) {
            isTurnedOn = true
        } else {
            println("Автомат уже включен.")
        }
    }

    fun turnOff() {
        if (isTurnedOn) {
            shutdownOS()
            isTurnedOn = false
        } else {
            println("Автомат уже выключен.")
        }
    }

    fun loadOS() {
        if (isTurnedOn && !isOsLoaded) {
            isOsLoaded = true
        } else if (!isTurnedOn) {
        } else {
            println("ОС уже была загружена.")
        }
    }

    fun shutdownOS() {
        if (isOsLoaded) {
            isOsLoaded = false
            isSessionPaid = false
        }
    }

    fun showGames(): List<String> {
        installedGames.forEach { println("- $it") }
        return installedGames
    }

    fun startGame(gameName: String): Boolean {
        if (!isTurnedOn || !isOsLoaded) {
            return false
        }
        if (!isSessionPaid) {
            return false
        }
        if (gameName in installedGames) {
            return true
        } else {
            return false
        }
    }

    fun payForSession(amount: Double): Boolean {
        if (amount >= gameSessionCost) {
            cashBalance += gameSessionCost
            isSessionPaid = true
            return true
        } else {
            return false
        }
    }

    fun collectCash(enteredPin: String): Double {
        if (enteredPin == this.pinCode) {
            return openSafeAndGetCash()
        } else {
            return 0.0
        }
    }

    private fun openSafeAndGetCash(): Double {
        val collectedAmount = cashBalance
        cashBalance = 0.0
        return collectedAmount
    }
}