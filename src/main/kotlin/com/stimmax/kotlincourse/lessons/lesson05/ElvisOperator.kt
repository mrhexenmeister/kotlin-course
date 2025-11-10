package org.example.com.stimmax.kotlincourse.lessons.lesson05
fun main (){
    intensityafter()
    cargodelivery()
    regpressure()
}
//Задача 1
//Контекст: Вы изучаете физическое явление затухания звука в помещении.
// У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования
// данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания.
// Интенсивность звука после затухания пропорциональна начальной интенсивности,
// умноженной на коэффициент затухания. Если коэффициент затухания неизвестен,
// использовать стандартное значение 0.5.
fun intensityafter(){
    val baseIntensity: Double= 80.0
    val coeffatten:Double?=0.9
    val standartcoeff = 0.5
    val resulintensity = baseIntensity * ( coeffatten ?: standartcoeff )
}
//Задача 2
//Контекст: Клиент оплачивает доставку груза.
// К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости.
// В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
fun cargodelivery(){
    val cargodeliveryprice:Double=20000.0
    val cargoprice:Double?=10000.0
    val cargoinsur: Double=0.005
    val standartcargoprice:Double=50.0
    val resultdelivery = cargodeliveryprice + ((cargoprice ?: standartcargoprice) * cargoinsur)
}

//Задача 3

//Контекст: Вы проводите метеорологические измерения.
// Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано.
// Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
fun regpressure(){
    val atmopressure:String?="720"
    val indicatorswoutpress: String = "Warning!"
    val warningmess = atmopressure ?: indicatorswoutpress

}