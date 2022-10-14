package com.mohirdev.quiz.plans

import com.mohirdev.quiz.model.PlanModel

fun android(): List<PlanModel> {
    return listOf(
        PlanModel("Kotlin asoslari", "Kurs boshida kotlin tilidan foydalangal holda dasturlashga kirish qilinadi. Kichik dasturlar va masalar yechish yordamida ushbu tilning imkoniyatlari o’rganiladi. Ma’lumot turali va algoritmlar haqida qisqacha to’xtalib o’tiladi."),
        PlanModel("OOP va to’plamlar", "OOPning asosiy qonun qoidalarini va ular yordamida dastur yozishni o’rganasiz. To’plamlarga tegishli bo’lgan ma’lumot turlari va ular bilan ishlashdagi maxsus funksiyalardan foydalanasiz."),
        PlanModel("Murakkab Kotlin tushunchalari", "Ushbu tildagi ishimizni yengillashtiradigan va kodni qisqartiradigan imkoniyatlarni ko’rib chiqamiz. Dasturdagi xatoliklarni aniqlash va oldini olishni o’rganamiz."),
        PlanModel("Androidga kirish", "Android Studioni o’rnatib, Androiddagi birinchi dasturimizni ishga tushirib ko’ramiz. Oddiy dizaynlar qillishdagi asosiy klasslar bilan tanishamiz. Androidning asosiy komponentalariga kirish qilib, ulardan foydalangan holda oddiy dasturlar qilib ko’riladi."),
        PlanModel("Murakkab dizaynlar", "Material Design qoidalari ko’rib chiqiladi. Bir nechta murakkab ilovalar dizaynlari chiziladi. Bir nechta ekranlarni boshqaruvining optimalroq yo’llari qilinadi."),
        PlanModel("Ma’lumot saqlash usullari", "Androidda ma’lumot saqlash uchun bir nechta usullar ko’rib chiqiladi. Ularni yaratish, o’chirish, o’qish va o’zgartirish operatsiyalari o’rganiladi."),
        PlanModel("Ko’p tarmoqli dastur", "Kodlarni parallel ravishda ishlatish, Javadagi tarmoqlar, RxJavadan foydalanish o’rganiladi."),
        PlanModel(" Internet bilan ishlash", "Androiddagi kattaroq loyihalarni qilishga o’tiladi. Ma’lumot almashish protokollari va APIlar bilan ishlash qilinadi."),
        PlanModel("Arxitektura ", "MVVM kabi dastur yozish usulini ko’ramiz. Dependancy Injection bilan tanishamiz va dasturimizni bir nechta bo’laklarga bo’lib tashlab ularni ulagan holda toza arxitektura qilishni o’rganamiz."),
        PlanModel("Animatsiyalar", "XML fayllarda qilishimiz mumkun bo’lgan barcha imkoniyatlarni ko’rib chiqish, animatsiya qilishning turli usullarini ko’rish va Lotti fayllar bilan ishlaymiz."),
        PlanModel("Dasturni Play marketga joylash", "Kurs yakunida Play marketda akkaunt ochish, dasturlarni joylash va yangilashlarni amalga oshirish o'rganiladi"),
    )
}
fun math(): List<PlanModel> {
    return listOf(
        PlanModel("Natural sonlar", "Boshlang'ich kurs"),
        PlanModel("Tenglamalar", "Boshlang'ich kurs"),
        PlanModel("Murakkab tenglamalar", "Boshlang'ich kurs"),
        PlanModel("Trigonametriya", "Boshlang'ich kurs"),
        PlanModel("Hosila", "Boshlang'ich kurs"),
    )
}
fun english(): List<PlanModel> {
    return emptyList()
}